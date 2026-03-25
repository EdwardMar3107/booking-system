package by.ezer.payment.dto;

import by.ezer.payment.entity.enums.Status;

import java.math.BigDecimal;
import java.util.UUID;

public record PaymentResponse(
        UUID Id,
        UUID bookingId,
        BigDecimal amount,
        Status status,
        String paymentUrl
) {
}
