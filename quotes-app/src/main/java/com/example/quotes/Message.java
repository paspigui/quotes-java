package com.example.quotes;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String text;
    private String response;
    private LocalDateTime timestamp;

    public Message() {}

    public Message(String username, String text, String response) {
        this.username = username;
        this.text = text;
        this.response = response;
        this.timestamp = LocalDateTime.now();
    }

    public Long getId() { return id; }
    public String getUsername() { return username; }
    public String getText() { return text; }
    public String getResponse() { return response; }
    public LocalDateTime getTimestamp() { return timestamp; }
}
