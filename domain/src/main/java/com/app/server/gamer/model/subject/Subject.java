package com.app.server.gamer.model.subject;

import com.app.server.gamer.model.post.Post;
import com.app.server.gamer.model.user.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.val;
import org.hibernate.annotations.BatchSize;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "ID_SUBJECT")
    private long id;
    @Column(nullable = false)
    private String value;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "subject")
    List<Post> postList;

    public Subject(String value){
        this.value = value;
    }
}
