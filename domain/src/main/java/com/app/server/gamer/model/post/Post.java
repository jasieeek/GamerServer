package com.app.server.gamer.model.post;

import com.app.server.gamer.model.subject.Subject;
import com.app.server.gamer.model.user.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "ID_POST")
    private long id;
    private String title;
    private Date createDate;
    private Date modifyDate;
    @Column(columnDefinition = "TEXT")
    private String content;

    @ManyToOne
    @JoinColumn(name = "SUBJECT_ID")
    Subject subject;
    @ManyToOne
    @JoinColumn(name = "USER_ID")
    User user;

}
