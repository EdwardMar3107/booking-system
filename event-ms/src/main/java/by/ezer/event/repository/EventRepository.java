package by.ezer.event.repository;

import by.ezer.event.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface EventRepository extends JpaRepository<Event, UUID> {
    List<Event> findByCreatedBy(String createdBy);
    List<Event> findByEventDate(LocalDate eventDate);
    List<Event> findByCreatedByAndEventDate(String createdBy, LocalDate eventDate);
}
