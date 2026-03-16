package by.ezer.booking.service.impl;

import by.ezer.booking.dto.BookingResponse;
import by.ezer.booking.dto.CreateBookingRequest;
import by.ezer.booking.entity.Booking;
import by.ezer.booking.entity.Status;
import by.ezer.booking.mapper.BookingMapper;
import by.ezer.booking.repository.BookingRepository;
import by.ezer.booking.service.BookingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class BookingServiceImpl implements BookingService {

    private final BookingRepository bookingRepository;
    private final BookingMapper bookingMapper;

    @Override
    public BookingResponse createBooking(CreateBookingRequest request, String userEmail) {

        Booking booking = bookingMapper.toEntity(request);

        booking.setUserEmail(userEmail);

        bookingRepository.save(booking);

        return bookingMapper.toResponse(booking);
    }
}
