package com.app.server.gamer.model.post;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    @Id
    private long id;
    private String title;
    private Date createDate;
    private Date modifyDate;
    @Column(columnDefinition = "TEXT")
    private String content;
    // powiazanie z subjectem
}
