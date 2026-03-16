package by.ezer.booking.client;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Component
@RequiredArgsConstructor
public class EventClient {

    private final RestTemplate restTemplate;

    public void checkEvent(UUID eventId) {

        restTemplate.getForObject(
                "http://localhost:8082/events/" + eventId,
                Object.class
        );
    }
}
