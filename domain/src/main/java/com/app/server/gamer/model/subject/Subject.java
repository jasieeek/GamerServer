package com.app.server.gamer.model.subject;

import com.app.server.gamer.model.post.Post;
import com.app.server.gamer.model.user.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_SUBJECT")
    private long id;
    private String value;
    @ManyToOne
    private User user;
    @OneToMany(mappedBy = "subject")
    List<Post> posts;

    public Subject(String value, User user) {
        this.value = value;
        this.user = user;
    }
}
