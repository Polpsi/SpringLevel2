package springlevel2.cloudrouter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class CloudrouterApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudrouterApplication.class, args);
    }

}
