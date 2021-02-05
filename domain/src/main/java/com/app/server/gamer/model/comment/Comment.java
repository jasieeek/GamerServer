package com.app.server.gamer.model.comment;

import com.app.server.gamer.model.news.News;
import com.app.server.gamer.model.user.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_COMMENT")
    private long id;
    private String content;
    @ManyToOne
    private News news;
    @ManyToOne
    private User user;
}
