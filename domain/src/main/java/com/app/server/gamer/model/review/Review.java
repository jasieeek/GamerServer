package com.app.server.gamer.model.review;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Review {
    @Id
    private long id;
    @Column(columnDefinition = "TEXT")
    private String content;
    // powiazanie z userem i z game
}
