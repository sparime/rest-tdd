package com.bench.tdd.demo.tdddemo.user;

import com.bench.tdd.demo.tdddemo.post.Post;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user")
@ApiModel(description = "User class")
public class SUser {

    @Id
    @GeneratedValue
    private int id;
    @ApiModelProperty("Cannot be an empty string")
    private String username;



    // make space for posts
    @OneToMany(mappedBy = "user")
    private List<Post> user_posts;

    public SUser(String username) {
        this.username = username;
    }

    protected SUser() {
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Post> getUser_posts() {
        return user_posts;
    }

    public void setUser_posts(List<Post> user_posts) {
        this.user_posts = user_posts;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                '}';
    }
}
