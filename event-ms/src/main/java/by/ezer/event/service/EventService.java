package by.ezer.event.service;

import by.ezer.event.dto.CreateEventRequest;
import by.ezer.event.dto.EventResponse;
import org.springframework.stereotype.Repository;

public interface EventService {
    EventResponse createEvent(CreateEventRequest request, String userEmail);
}
