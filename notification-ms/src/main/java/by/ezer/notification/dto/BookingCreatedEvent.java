package by.ezer.notification.dto;

import java.util.UUID;

public record BookingCreatedEvent(
        UUID bookingId,
        UUID eventId,
        String userEmail
) {
}
