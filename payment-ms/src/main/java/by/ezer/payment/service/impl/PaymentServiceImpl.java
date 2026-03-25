package by.ezer.payment.service.impl;

import by.ezer.payment.dto.PaymentRequest;
import by.ezer.payment.dto.PaymentResponse;
import by.ezer.payment.entity.Payment;
import by.ezer.payment.mapper.PaymentMapper;
import by.ezer.payment.repository.PaymentRepository;
import by.ezer.payment.service.PaymentService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {

    private final PaymentRepository paymentRepository;
    private final PaymentMapper paymentMapper;

    @Override
    @Transactional
    public PaymentResponse processPayment(PaymentRequest request) {

        Payment payment = paymentMapper.toEntity(request);

        Payment saved = paymentRepository.save(payment);

        String paymentUrl = "https://edwardmar3107.github.io/payment-page/?bookingId=" + request.bookingId();

        return paymentMapper.toResponse(saved);
    }
}
