package by.ezer.booking.dto;

import by.ezer.booking.entity.enums.Status;

import java.util.UUID;

public record BookingResponse(
        UUID id,
        UUID eventId,
        String userEmail,
        Status status
) {}
