package by.ezer.booking.service;

import by.ezer.booking.dto.BookingResponse;
import by.ezer.booking.dto.CreateBookingRequest;

public interface BookingService {
    BookingResponse createBooking(CreateBookingRequest request, String userEmail);
}
