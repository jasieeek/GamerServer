package com.app.server.gamer.model.user;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_USER")
    private long id;
    private String login;
    private String password;
    private String salt;
    private String email;
    private String avatar;
    private boolean activated;
    private boolean isAdmin;
    private boolean isEditor;

    public User(String login, String password, String salt, String email, String avatar, boolean activated, boolean isAdmin, boolean isEditor) {
        this.login = login;
        this.password = password;
        this.salt = salt;
        this.email = email;
        this.avatar = avatar;
        this.activated = activated;
        this.isAdmin = isAdmin;
        this.isEditor = isEditor;
    }
}
