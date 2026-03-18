package by.ezer.payment.service;

import by.ezer.payment.dto.PaymentRequest;
import by.ezer.payment.dto.PaymentResponse;

public interface PaymentService {
    PaymentResponse processPayment(PaymentRequest request);
}
