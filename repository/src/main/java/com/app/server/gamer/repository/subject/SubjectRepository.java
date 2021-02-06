package com.app.server.gamer.repository.subject;

import com.app.server.gamer.model.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface SubjectRepository extends JpaRepository<Subject, Long> {}
