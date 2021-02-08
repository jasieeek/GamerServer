package com.app.server.gamer.service.mailService;

import com.app.server.gamer.repostiory.activationLink.ActivationLinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@Service
public class MailService {

    private JavaMailSender javaMailSender;

    @Autowired
    public MailService(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    public void sendActivationLink(String email, String link){
        MimeMessage mail = javaMailSender.createMimeMessage();
        try{
            MimeMessageHelper helper = new MimeMessageHelper(mail, true);
            helper.setFrom("gamer.activation.link@gamil.com");
            helper.setTo(email);
            helper.setSubject("Activation link");
            helper.setText("<p><a href=\"http://localhost:8080/app/activate/"+link+"\">Click to activate your account.</a></p>", true);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
        javaMailSender.send(mail);
    }
}
