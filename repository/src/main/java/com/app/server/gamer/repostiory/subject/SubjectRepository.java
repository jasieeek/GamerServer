package com.app.server.gamer.repostiory.subject;

import com.app.server.gamer.model.subject.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject, Long> {
}
