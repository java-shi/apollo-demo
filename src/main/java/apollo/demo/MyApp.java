package apollo.demo;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: Sfy
 * @Date: 2020/6/30 0030 16:12
 */
@SpringBootApplication
@EnableApolloConfig
public class MyApp {
    public static void main(String[] args) {
        SpringApplication.run(MyApp.class);
    }
}
