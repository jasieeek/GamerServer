package com.app.server.gamer.service.activationLink;

import com.app.server.gamer.model.activationLink.ActivationLink;
import com.app.server.gamer.model.user.User;
import com.app.server.gamer.repostiory.activationLink.ActivationLinkRepository;
import com.app.server.gamer.service.mailService.MailService;
import com.app.server.gamer.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Random;

@Service
public class ActivationLinkService {

    @Autowired
    private UserService userService;
    @Autowired
    private ActivationLinkRepository activationLinkRepository;
    @Autowired
    private MailService mailService;

    public String generateLink() {
        final int numberCount = 8;
        Random random = new Random();
        String numbers = "";
        for(int i=0; i<numberCount; i++){
            numbers+=random.nextInt(99);
        }
        return numbers;
    }
    public void deleteLinkAfterActivation(String content) {
        activationLinkRepository.deleteActivationLinkByContent(content);
    }
    public void serveRegistration(User user, String link){
        activationLinkRepository.save(new ActivationLink(link, user));
        mailService.sendActivationLink(user.getEmail(), link);
    }
    public void activateUser(String content){
        ActivationLink activationLink = activationLinkRepository.findActivationLinkByContent(content);
        userService.activateUser(activationLink.getUser());
        deleteLinkAfterActivation(content);
    }
}
