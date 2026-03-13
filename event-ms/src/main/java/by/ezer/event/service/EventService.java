package by.ezer.event.service;

import by.ezer.event.dto.CreateEventRequest;
import by.ezer.event.dto.EventResponse;
import by.ezer.event.entity.Event;
import by.ezer.event.repository.EventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EventService {

    private final EventRepository eventRepository;

    public EventResponse createEvent(CreateEventRequest request, String userEmail) {

        Event event = Event.builder()
                .title(request.title())
                .description(request.description())
                .location(request.location())
                .eventDate(request.eventDate())
                .createdBy(userEmail)
                .build();

        Event savedEvent = eventRepository.save(event);

        return new EventResponse(
                savedEvent.getId(),
                savedEvent.getTitle(),
                savedEvent.getDescription(),
                savedEvent.getLocation(),
                savedEvent.getEventDate(),
                savedEvent.getCreatedBy()
        );
    }
}
