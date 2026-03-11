package by.ezer.auth.repository;

import by.ezer.auth.entity.Credentials;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface CredentialsRepository extends JpaRepository<Credentials, UUID> {

    Optional<Credentials> findByEmail(String email);
    boolean existsByEmail(String email);
}
