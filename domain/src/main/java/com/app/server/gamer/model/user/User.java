package com.app.server.gamer.model.user;

import com.app.server.gamer.model.comment.Comment;
import com.app.server.gamer.model.news.News;
import com.app.server.gamer.model.post.Post;
import com.app.server.gamer.model.review.Review;
import com.app.server.gamer.model.subject.Subject;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_USER")
    private long id;
    private String login;
    private String password;
    private String email;
    private String avatar;
    private boolean isAdmin;
    private boolean isEditor;
    @OneToMany(mappedBy = "user")
    private List<Subject> subjects;
    @OneToMany(mappedBy = "user")
    private List<Post> posts;
    @OneToMany
    @JoinColumn(name = "USER_ID", referencedColumnName = "ID_USER")
    private List<Review> reviews;
    @OneToMany
    @JoinColumn(name = "USER_ID", referencedColumnName = "ID_USER")
    private List<News> newsList;
    @OneToMany
    @JoinColumn(name = "USER_ID", referencedColumnName = "ID_USER")
    private List<Comment> comments;

    public User(String login, String password, String email, String avatar, boolean isAdmin, boolean isEditor) {
        this.login = login;
        this.password = password;
        this.email = email;
        this.avatar = avatar;
        this.isAdmin = isAdmin;
        this.isEditor = isEditor;
    }
}
