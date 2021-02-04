package com.app.server.gamer.service.post;

import com.app.server.gamer.model.post.Post;
import com.app.server.gamer.repostiory.post.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> getPosts() {
        return postRepository.findAll();
    }
}
