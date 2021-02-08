package com.app.server.gamer.model.review;

import com.app.server.gamer.model.game.Game;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_REVIEW")
    private long id;
    @Column(columnDefinition = "TEXT")
    private String content;
    @ManyToOne
    private Game game;
}
