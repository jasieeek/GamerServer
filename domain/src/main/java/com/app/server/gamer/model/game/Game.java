package com.app.server.gamer.model.game;

import com.app.server.gamer.model.rating.Rating;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_GAME")
    private long id;
    private String title;
    private String image;
    @ManyToMany
    private List<Rating> ratings;
}
