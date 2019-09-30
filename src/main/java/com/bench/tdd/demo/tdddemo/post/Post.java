package com.bench.tdd.demo.tdddemo.post;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "post")
@ApiModel(description = "User class")
public class Post {

    @Id
    @GeneratedValue
    private long postId;
    @ApiModelProperty("Upto 140 characters long")
    private String postContent;

    public Post(String postContent) {
        this.postContent = postContent;
    }

    public long getPostId() {
        return postId;
    }

    public void setPostId(long postId) {
        this.postId = postId;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    @Override
    public String toString() {
        return "Post{" +
                "postId=" + postId +
                ", postContent='" + postContent + '\'' +
                '}';
    }

    public Post() {
    }
}
