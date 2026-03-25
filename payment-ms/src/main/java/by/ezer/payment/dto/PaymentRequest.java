package by.ezer.payment.dto;

import java.util.UUID;

public record PaymentRequest(
        UUID bookingId,
        Double amount
) {}
