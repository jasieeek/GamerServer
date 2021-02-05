package com.app.server.gamer.model.news;

import com.app.server.gamer.model.comment.Comment;
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
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_NEWS")
    private long id;
    private Date createDate;
    private Date modifyDate;
    @Column(columnDefinition = "TEXT")
    private String content;
    @ManyToOne
    private User user;
}
