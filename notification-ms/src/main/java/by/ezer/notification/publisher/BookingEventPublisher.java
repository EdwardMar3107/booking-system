package by.ezer.notification.publisher;

import by.ezer.notification.dto.BookingCreatedEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BookingEventPublisher {

    private final RabbitTemplate rabbitTemplate;

    public void publisherBookingCreated(BookingCreatedEvent event) {

        rabbitTemplate.convertAndSend(
                "booking.exchange",
                "booking.created",
                event
        );
    }
}
