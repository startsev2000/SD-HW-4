package com.kater.sfhw4.service;

import com.kater.sfhw4.model.Session;
import com.kater.sfhw4.repository.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SessionService {
    private final SessionRepository sessionRepository;

    @Autowired
    public SessionService(SessionRepository sessionRepository) {
        this.sessionRepository = sessionRepository;
    }

    public Integer getUserBySessionToken(String sessionToken) {
        return sessionRepository.findBySessionToken(sessionToken)
                .map(Session::getUserId)
                .orElse(null);
    }
}
