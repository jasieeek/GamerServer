package com.app.server.gamer.repostiory.game;

import com.app.server.gamer.model.game.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
