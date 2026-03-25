package by.ezer.auth.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record RegisterRequest(

        @Email(message = "Please provide a valid email address")
        @NotBlank(message = "Email is required")
        @Size(min = 12, max = 100, message = "Email must be between 12 and 100 characters")
        String email,

        @NotBlank(message = "Password is required")
        @Size(min = 6, max = 100, message = "Password must be between 6 and 100 characters")
        String password) {
}
