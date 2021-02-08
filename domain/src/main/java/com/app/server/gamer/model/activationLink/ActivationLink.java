package com.app.server.gamer.model.activationLink;

import com.app.server.gamer.model.user.User;

import javax.persistence.*;

public class ActivationLink {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ACTIVATION_LINK")
    private long id;
    private String content;
    @OneToOne
    @JoinColumn(name = "USER_ID")
    private User user;
}
