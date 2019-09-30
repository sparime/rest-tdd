package com.bench.tdd.demo.tdddemo.post;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
public class PostServiceLayerIntegrationTest {
    // test config to mock the repo bean
    @TestConfiguration
    static class PostServiceImplTestConfig {

        @Bean
        public PostService postService() {
            return new PostServiceImpl();
        }
    }

    @Autowired
    private PostService postService;

    @MockBean
    private PostRepository postRepository;

    // pre and post test setup

    @Before
    public void setUp() {
        Post post = new Post("Service layer post test");
        Mockito.when(postRepository.findPostByPostContent(post.getPostContent()))
                .thenReturn(post);
    }

    // set up after test/ teardown here

    @Test
    public void whenContentMatches_thenPostShouldBeFound() {
        String postContent = "Service layer post test";
        Post found = postService.getPostByContent(postContent);

        //test
        assertThat(found.getPostContent()).isEqualToIgnoringCase(postContent);
    }
}
