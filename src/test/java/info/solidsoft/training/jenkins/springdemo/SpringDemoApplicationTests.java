package info.solidsoft.training.jenkins.springdemo;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringDemoApplicationTests {

    @Test
    public void contextLoads() {
        int i = 2;
        Assertions.assertThat(i).isEqualTo(2);
    }

}
