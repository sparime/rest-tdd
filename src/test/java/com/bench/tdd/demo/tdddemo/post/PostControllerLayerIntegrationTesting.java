package com.bench.tdd.demo.tdddemo.post;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
// what controller?
@WebMvcTest(PostController.class)
@AutoConfigureMockMvc
public class PostControllerLayerIntegrationTesting {

    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private PostService postService;

    @MockBean
    private PostRepository postRepository;

    @TestConfiguration
    static class PostControllerTestContextConfig {

        @Bean
        public PostService postService() {
            return new PostServiceImpl();
        }
    }

    // test cases here
    @Test
    public void givenPosts_returnAllPostsJsonArray() throws Exception {

    }

}
