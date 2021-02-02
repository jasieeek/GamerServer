package com.app.server.gamer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    private long id;
    private String login;
    private String password;
    private String email;
    private String avatar;
    private boolean isAdmin;
    private boolean isEditor;
}
