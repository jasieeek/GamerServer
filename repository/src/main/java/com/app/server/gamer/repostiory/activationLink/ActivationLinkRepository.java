package com.app.server.gamer.repostiory.activationLink;

import com.app.server.gamer.model.activationLink.ActivationLink;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

public interface ActivationLinkRepository extends JpaRepository<ActivationLink, Long> {
    ActivationLink findActivationLinkByContent(String content);
    @Transactional
    void deleteActivationLinkByContent(String content);
}
