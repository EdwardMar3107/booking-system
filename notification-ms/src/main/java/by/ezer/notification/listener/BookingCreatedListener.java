package by.ezer.notification.listener;

import by.ezer.notification.dto.BookingCreatedEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class BookingCreatedListener {

    @RabbitListener(queues = "booking.created.queue")
    public void handleBookingCreated(BookingCreatedEvent event) {

        log.info("Received booking event: {}", event);

        log.info("Sending email to {}", event.userEmail());
    }
}
