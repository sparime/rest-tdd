package com.bench.tdd.demo.tdddemo.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

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
    public SUser(String username) {
        this.username = username;
    }

    public SUser() {}
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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                '}';
    }
}
