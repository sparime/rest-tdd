package user;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

// general test runner
@RunWith(SpringRunner.class)
// JPA test class
@DataJpaTest
public class UserRepositoryIntegrationTest {

    // entity manager to setup basic H2 config stuff
    @Autowired
    private TestEntityManager entityManager;
}
