package by.ezer.event.service;

import by.ezer.event.dto.CreateEventRequest;
import by.ezer.event.dto.EventResponse;

public interface EventService {
    EventResponse createEvent(CreateEventRequest request, String userEmail);
}
