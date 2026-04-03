package by.ezer.gateway;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
@EnableAutoConfiguration
public class GatewayApplication {
    static void main(String[] args) {
        SpringApplicationBuilder builder = new SpringApplicationBuilder(GatewayApplication.class);
        builder.web(WebApplicationType.REACTIVE);   // ← вот это важно
        builder.run(args);
    }
}