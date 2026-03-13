package by.ezer.event.dto;

import java.time.LocalDate;

public record CreateEventRequest(String title,
                                 String description,
                                 String location,
                                 LocalDate eventDate) {
}
