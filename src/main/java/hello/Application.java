package hello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

    @Value("${message.of.the.day}")
    private String message_of_the_day;

    @RequestMapping("/")
    private String home() {
        return String.format("Hello, %s", message_of_the_day);
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
