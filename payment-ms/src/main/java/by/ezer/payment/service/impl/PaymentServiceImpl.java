package by.ezer.payment.service.impl;

import by.ezer.payment.dto.PaymentRequest;
import by.ezer.payment.dto.PaymentResponse;
import by.ezer.payment.entity.Payment;
import by.ezer.payment.mapper.PaymentMapper;
import by.ezer.payment.repository.PaymentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentServiceImpl {

    private final PaymentRepository paymentRepository;
    private final PaymentMapper paymentMapper;

    public PaymentResponse processPayment(PaymentRequest request) {

        Payment payment = paymentMapper.toEntity(request);

        Payment saved = paymentRepository.save(payment);

        return paymentMapper.toResponse(saved);
    }
}
