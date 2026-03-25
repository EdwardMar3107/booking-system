package by.ezer.auth.service;

import by.ezer.auth.dto.AuthResponse;

public interface AuthService {
    AuthResponse register(String email, String password);
    AuthResponse login(String email, String password);
}
