package by.ezer.booking.dto;

import java.util.UUID;

public record BookingCreatedEvent(
        UUID bookingId,
        UUID eventId,
        String userEmail
) {}
