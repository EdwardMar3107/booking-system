package by.ezer.event.controller;

import by.ezer.event.dto.CreateEventRequest;
import by.ezer.event.dto.EventResponse;
import by.ezer.event.service.impl.EventServiceImpl;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/events")
@RequiredArgsConstructor
public class EventController {

    private final EventServiceImpl eventService;

    @PostMapping
    public ResponseEntity<EventResponse> createEvent(@Valid @RequestBody CreateEventRequest request,
                                                     @RequestHeader("X-User-Email") String userEmail) {

        EventResponse response = eventService.createEvent(request, userEmail);

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
