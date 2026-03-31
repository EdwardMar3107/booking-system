package by.ezer.booking.messaging;

import by.ezer.booking.dto.BookingCreatedEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BookingEventPublisher {

    private final RabbitTemplate rabbitTemplate;

    @Value("${spring.rabbitmq.booking.exchange}")
    private String bookingExchange;

    @Value("${spring.rabbitmq.booking.routing-key.created}")
    private String bookingCreatedRoutingKey;

    public void publishBookingCreated(BookingCreatedEvent event) {
        rabbitTemplate.convertAndSend(
                bookingExchange,
                bookingCreatedRoutingKey,
                event
        );
    }
}
