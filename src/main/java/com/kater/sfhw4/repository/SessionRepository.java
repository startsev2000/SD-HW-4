package com.kater.sfhw4.repository;

import com.kater.sfhw4.model.Session;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SessionRepository extends JpaRepository<Session, Integer> {
    Optional<Session> findBySessionToken(String sessionToken);
}
