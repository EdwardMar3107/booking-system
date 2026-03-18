package by.ezer.payment.dto;

import by.ezer.payment.entity.enums.Status;

import java.util.UUID;

public record PaymentResponse(
        UUID paymentId,
        UUID bookingId,
        Status status
) {
}
