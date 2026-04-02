package by.ezer.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class GatewayApplication {
    static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }
}