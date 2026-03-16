package by.ezer.booking.dto;

import by.ezer.booking.entity.Status;

import java.time.LocalDateTime;
import java.util.UUID;

public record BookingResponse(
        UUID id,
        UUID eventId,
        String userEmail,
        Status status
) {}
