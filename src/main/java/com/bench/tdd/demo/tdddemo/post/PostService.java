package com.bench.tdd.demo.tdddemo.post;

import java.util.List;

public interface PostService {

    List<Post> getAllPosts();

    Post getPostByContent(String Content);
}
