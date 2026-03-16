package by.ezer.booking.messaging;

import by.ezer.booking.dto.BookingCreatedEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BookingEventPublisher {

    private final RabbitTemplate rabbitTemplate;

    public void publishBookingCreated(BookingCreatedEvent event) {

        rabbitTemplate.convertAndSend(
                "booking.exchange",
                "booking.created",
                event
        );
    }
}
