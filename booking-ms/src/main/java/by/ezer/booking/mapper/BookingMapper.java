package by.ezer.booking.mapper;

import by.ezer.booking.dto.BookingResponse;
import by.ezer.booking.dto.CreateBookingRequest;
import by.ezer.booking.entity.Booking;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookingMapper {

    Booking toEntity(CreateBookingRequest request);

    BookingResponse toResponse(Booking booking);
}
