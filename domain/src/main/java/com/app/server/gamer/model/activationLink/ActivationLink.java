package com.app.server.gamer.model.activationLink;

import com.app.server.gamer.model.user.User;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Entity
@Data
@NoArgsConstructor
public class ActivationLink {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ACTIVATION_LINK")
    private long id;
    private String content;
    @OneToOne
    @JoinColumn(name = "USER_ID")
    private User user;

    public ActivationLink(String content, User user) {
        this.content=content;
        this.user = user;
    }
}
