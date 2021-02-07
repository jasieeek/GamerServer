package com.app.server.gamer.model.user;

import com.app.server.gamer.model.post.Post;
import com.app.server.gamer.model.subject.Subject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "ID_USER")
    private long id;
    private String login;
    private String password;
    private String salt;
    private String email;
    private String avatar;
    private boolean isActivated;
    private boolean isAdmin;
    private boolean isEditor;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "user")
    List<Subject> subjectList;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "user")
    List<Post> postList;

    public User(String login, String password, String email, String avatar, boolean isAdmin, boolean isEditor) {
        this.login = login;
        this.password = password;
        this.email = email;
        this.avatar = avatar;
        this.isAdmin = isAdmin;
        this.isEditor = isEditor;
    }


    public List<Subject> getSubjectList() {
        return subjectList;
    }

}
