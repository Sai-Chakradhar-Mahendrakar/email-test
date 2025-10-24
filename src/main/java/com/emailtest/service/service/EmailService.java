package com.emailtest.service.service;

import com.emailtest.service.dto.EmailRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender javaMailSender;

    public void sendEmail(EmailRequest emailRequest) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(emailRequest.getSenderMail());
        message.setTo(emailRequest.getReceiverMail());
        message.setSubject(emailRequest.getSubject());
        message.setText(emailRequest.getMessage());

        javaMailSender.send(message);
    }
}
