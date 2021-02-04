package com.app.server.gamer.model.news;

import com.app.server.gamer.model.comment.Comment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

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
    @OneToMany
    @JoinColumn(name = "NEWS_ID", referencedColumnName = "ID_NEWS")
    private List<Comment> comments;
}
