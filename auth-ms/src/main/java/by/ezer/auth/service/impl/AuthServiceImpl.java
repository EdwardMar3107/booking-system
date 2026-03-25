package by.ezer.auth.service.impl;

import by.ezer.auth.dto.AuthResponse;
import by.ezer.auth.entity.Credentials;
import by.ezer.auth.exception.ServiceException;
import by.ezer.auth.repository.CredentialsRepository;
import by.ezer.auth.security.JwtService;
import by.ezer.auth.service.AuthService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final CredentialsRepository credentialsRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;

    @Override
    @Transactional
    public AuthResponse register(String email, String password) {

        if (credentialsRepository.existsByEmail(email)) {
            throw new ServiceException("Email already exists");
        }

        Credentials credentials = new Credentials();
        credentials.setEmail(email);
        credentials.setPasswordHash(passwordEncoder.encode(password));
        credentials.setCreatedAt(LocalDateTime.now());

        credentials = credentialsRepository.save(credentials);

        return new AuthResponse(jwtService.generateToken(credentials));
    }

    public AuthResponse login(String email, String password) {

        Credentials credentials = credentialsRepository.findByEmail(email)
                .orElseThrow(() -> new ServiceException("Invalid email"));

        if (!passwordEncoder.matches(password, credentials.getPasswordHash())) {
            throw new ServiceException("Invalid password");
        }

        return new AuthResponse(jwtService.generateToken(credentials));
    }
}
