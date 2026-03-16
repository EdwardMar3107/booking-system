package by.ezer.notification.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EmailService {

    public void sendBookingConfirmation(String email) {

        log.info("Sending booking confirmation email to {}", email);
    }
}
