package by.ezer.event.service.impl;

import by.ezer.event.dto.CreateEventRequest;
import by.ezer.event.dto.EventResponse;
import by.ezer.event.entity.Event;
import by.ezer.event.mapper.EventMapper;
import by.ezer.event.repository.EventRepository;
import by.ezer.event.service.EventService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EventServiceImpl implements EventService {

    private final EventRepository eventRepository;
    private final EventMapper eventMapper;

    @Override
    @Transactional
    public EventResponse createEvent(CreateEventRequest request, String userEmail) {

        Event event = eventMapper.toEntity(request, userEmail);

        Event savedEvent = eventRepository.save(event);

        return eventMapper.toResponse(savedEvent);

    }
}
