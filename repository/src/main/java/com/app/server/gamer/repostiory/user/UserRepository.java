package com.app.server.gamer.repostiory.user;

import com.app.server.gamer.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
