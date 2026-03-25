package by.ezer.event.mapper;

import by.ezer.event.dto.CreateEventRequest;
import by.ezer.event.dto.EventResponse;
import by.ezer.event.entity.Event;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface EventMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "createdBy", source = "userEmail")
    Event toEntity(CreateEventRequest request, String userEmail);

    EventResponse toResponse(Event event);
}
