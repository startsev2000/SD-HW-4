package com.kater.sfhw4.model;

import jakarta.persistence.*;
import lombok.Getter;
import com.kater.sfhw4.model.User;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "sessions")
@Getter
@Setter
public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int userId;
    private String sessionToken;
    private LocalDateTime expiresAt;

    // Getters and Setters
}