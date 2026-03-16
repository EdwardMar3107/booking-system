package by.ezer.booking.controller;

import by.ezer.booking.dto.BookingResponse;
import by.ezer.booking.dto.CreateBookingRequest;
import by.ezer.booking.service.BookingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/bookings")
public class BookingController {

    private final BookingService bookingService;

    @PostMapping
    public ResponseEntity<BookingResponse> createBooking(@RequestBody CreateBookingRequest request,
                                                         @RequestHeader("X-User-Email") String email) {

        BookingResponse response = bookingService.createBooking(request, email);

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
