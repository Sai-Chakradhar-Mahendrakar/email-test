package com.emailtest.service.service;

import com.emailtest.service.dto.EmailRequest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    private final JavaMailSender javaMailSender;

    public EmailService(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    public void sendEmail(EmailRequest emailRequest) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(emailRequest.getSenderMail());
        message.setTo(emailRequest.getReceiverMail());
        message.setSubject(emailRequest.getSubject());
        message.setText(emailRequest.getMessage());

        javaMailSender.send(message);
    }
}
