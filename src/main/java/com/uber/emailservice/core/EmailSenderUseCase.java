package com.uber.emailservice.core;

public interface EmailSenderUseCase {
    void sendEmail(String to, String subject, String body);
}
