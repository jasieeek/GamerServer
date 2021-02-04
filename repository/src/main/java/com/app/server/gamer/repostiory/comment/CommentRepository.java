package com.app.server.gamer.repostiory.comment;

import com.app.server.gamer.model.comment.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
