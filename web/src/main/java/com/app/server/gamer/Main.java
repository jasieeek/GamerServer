package com.app.server.gamer;

import com.app.server.gamer.model.news.News;
import com.app.server.gamer.model.post.Post;
import com.app.server.gamer.model.subject.Subject;
import com.app.server.gamer.model.user.User;
import com.app.server.gamer.repostiory.news.NewsRepository;
import com.app.server.gamer.repostiory.post.PostRepository;
import com.app.server.gamer.repostiory.subject.SubjectRepository;
import com.app.server.gamer.repostiory.user.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.support.ErrorPageFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.time.LocalDateTime;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
@ComponentScan(basePackages = {"com.app.server.gamer.*"})
@EntityScan(basePackages = {"com.app.server.gamer.*"})
@EnableJpaRepositories(basePackages = {"com.app.server.gamer.*"})
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class);
    }

    @Bean
    CommandLineRunner initUsers(UserRepository userRepository) {
        return args -> userRepository.saveAll(Stream.of(
                new User("login", "password", null, "email", "avatar",false, true, true),
                new User("login2", "password2", null, "email2", "avatar2", false,false, true),
                new User("login3", "password3", null, "email3", "avatar3",false,  false, false))
                .collect(Collectors.toList()));
    }

    @Bean
    CommandLineRunner initSubjects(SubjectRepository subjectRepository, UserRepository userRepository) {
        return args -> subjectRepository.saveAll(Stream.of(
                new Subject("Subject1", userRepository.findById(1L).orElse(null)),
                new Subject("Subject2", userRepository.findById(2L).orElse(null)),
                new Subject("Subject3", userRepository.findById(3L).orElse(null)))
                .collect(Collectors.toList()));

    }

    @Bean
    CommandLineRunner initPosts(PostRepository postRepository, SubjectRepository subjectRepository, UserRepository userRepository) {
        return args -> postRepository.saveAll(Stream.of(
                new Post(1L, "title", LocalDateTime.now(), LocalDateTime.now(), "content", userRepository.findById(1L).orElse(null), subjectRepository.findById(1L).orElse(null)),
                new Post(2L, "title2", LocalDateTime.now(), LocalDateTime.now(), "content2", userRepository.findById(1L).orElse(null), subjectRepository.findById(1L).orElse(null)),
                new Post(3L, "title3", LocalDateTime.now(), LocalDateTime.now(), "content3", userRepository.findById(2L).orElse(null), subjectRepository.findById(1L).orElse(null)))
                .collect(Collectors.toList()));
    }

//    @Bean
//    CommandLineRunner initNews(NewsRepository newsRepository, UserRepository userRepository) {
//        return args -> newsRepository.saveAll(Stream.of(
//                new News())
//                .collect(Collectors.toList()));
//    }
}
