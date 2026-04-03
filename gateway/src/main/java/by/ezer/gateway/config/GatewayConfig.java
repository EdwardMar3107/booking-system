package by.ezer.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()

                .route("auth-service", r -> r
                        .path("/auth/**")
                        .uri("http://localhost:8081")
                )

                .route("event-service", r -> r
                        .path("/event/**")
                        .uri("http://localhost:8082")
                )

                .route("booking-service", r -> r
                        .path("/booking/**")
                        .uri("http://localhost:8083")
                )

                .route("payment-service", r -> r
                        .path("/payment/**")
                        .uri("http://localhost:8084")
                )

                .route("notification-service", r -> r
                        .path("/notification/**")
                        .uri("http://localhost:8085")
                )

                .build();
    }
}
