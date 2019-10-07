package net.sahet.app12factor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RestApplicationTests {

    public static final String VATINFO_URI = "http://localhost:8888/api/rate";

    @Test
    public void contextLoads() {
    }


}
