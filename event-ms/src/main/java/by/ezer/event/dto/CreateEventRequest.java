package by.ezer.event.dto;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public record CreateEventRequest(@NotBlank(message = "Title is required")
                                 @Size(max = 200, message = "Title must be at most 255 characters")
                                 String title,

                                 @Size(max = 1000, message = "Description must be at most 1000 characters")
                                 String description,

                                 @NotBlank(message = "Location is required")
                                 @Size(max = 255, message = "Location must be at most 255 characters")
                                 String location,

                                 @NotNull(message = "Event date is required")
                                 @FutureOrPresent(message = "Event date cannot be in the past")
                                 LocalDate eventDate) {
}
