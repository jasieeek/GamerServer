package com.app.server.gamer.model.post;

import com.app.server.gamer.model.subject.Subject;
import com.app.server.gamer.model.user.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_POST")
    private long id;
    private String title;
    private LocalDateTime createDate;
    private LocalDateTime modifyDate;
    @Column(columnDefinition = "TEXT")
    private String content;
    @ManyToOne
    private User user;
    @ManyToOne
    private Subject subject;
}
