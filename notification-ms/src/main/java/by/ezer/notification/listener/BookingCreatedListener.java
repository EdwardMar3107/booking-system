package by.ezer.notification.listener;

import by.ezer.notification.dto.BookingCreatedEvent;
import by.ezer.notification.service.EmailService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class BookingCreatedListener {

    private final EmailService emailService;

    @RabbitListener(queues = "booking.created.queue")
    public void handleBookingCreated(BookingCreatedEvent event) {

        log.info("Received booking event: {}", event);

        emailService.sendBookingConfirmation(event.userEmail());
    }
}
