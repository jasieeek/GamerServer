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
    private String email;
    private String avatar;
    private boolean isAdmin;
    private boolean isEditor;

    public User(String login, String password, String email, String avatar, boolean isAdmin, boolean isEditor) {
        this.login = login;
        this.password = password;
        this.email = email;
        this.avatar = avatar;
        this.isAdmin = isAdmin;
        this.isEditor = isEditor;
    }
}
