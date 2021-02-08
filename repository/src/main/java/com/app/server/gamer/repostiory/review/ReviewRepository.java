package com.app.server.gamer.repostiory.review;

import com.app.server.gamer.model.review.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
