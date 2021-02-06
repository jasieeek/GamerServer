package com.app.server.gamer.service.user;

import com.app.server.gamer.model.subject.Subject;
import com.app.server.gamer.model.user.User;
import com.app.server.gamer.repository.subject.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.stream.Collectors;
import java.util.stream.Stream;
@Service
public class SubjectService {
    @Autowired
    private SubjectRepository subjectRepository;

    @PostConstruct
    public void initUsers() {
        subjectRepository.saveAll(Stream.of(
                new Subject("xd"))
                .collect(Collectors.toList()));
    }
}
