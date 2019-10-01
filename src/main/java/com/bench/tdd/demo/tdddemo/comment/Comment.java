package com.bench.tdd.demo.tdddemo.comment;

import com.bench.tdd.demo.tdddemo.post.Post;
import com.bench.tdd.demo.tdddemo.user.SUser;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "comment")
public class Comment {
    @Id
    @GeneratedValue
    private long commentId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private SUser user;
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private Post post;

    private String comment;


    public Comment(SUser user, Post post, String comment) {
        this.user = user;
        this.post = post;
        this.comment = comment;
    }

    public SUser getUser() {
        return user;
    }

    public void setUser(SUser user) {
        this.user = user;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public long getCommentId() {
        return commentId;
    }

    public void setCommentId(long commentId) {
        this.commentId = commentId;
    }

    protected Comment() {
    }
}
