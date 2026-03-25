package by.ezer.event.dto;

import java.time.LocalDate;
import java.util.UUID;

public record EventResponse(UUID id,
                            String title,
                            String description,
                            String location,
                            LocalDate eventDate,
                            String createdBy) {
}
