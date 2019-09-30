package com.bench.tdd.demo.tdddemo.post;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class PostRepositoryIntegrationTest {

    // entity manager to set up h2
    @Autowired
    private TestEntityManager entityManager;
    @Autowired
    PostRepository postRepository;

    // test cases
    @Test
    public void findByPostContent_thenReturnPost() {
        Post post = new Post("Test post content");
        entityManager.persist(post);
        entityManager.flush();

        // fetch
        Post found = postRepository.findPostByPostContent(post.getPostContent());
        // test
        assertThat(found.getPostContent()).isEqualTo(post.getPostContent());
    }

}
