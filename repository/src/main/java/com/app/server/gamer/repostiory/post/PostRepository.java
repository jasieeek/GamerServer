package com.app.server.gamer.repostiory.post;

import com.app.server.gamer.model.post.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
