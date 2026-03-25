package by.ezer.payment.mapper;

import by.ezer.payment.dto.PaymentRequest;
import by.ezer.payment.dto.PaymentResponse;
import by.ezer.payment.entity.Payment;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PaymentMapper {

    Payment toEntity(PaymentRequest request);

    PaymentResponse toResponse(Payment payment);
}
