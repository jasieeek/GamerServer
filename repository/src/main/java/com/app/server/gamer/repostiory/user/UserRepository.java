package com.app.server.gamer.repostiory.user;

import com.app.server.gamer.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findUserByLogin(String login);
    User findUserByEmail(String email);
}
