package com.app.server.gamer.model.subject;

import com.app.server.gamer.model.user.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_SUBJECT")
    private long id;
    private String value;
    @ManyToOne
    private User user;

    public Subject(String value, User user) {
        this.value = value;
        this.user = user;
    }
}
