package com.emailtest.service.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class EmailRequest {
    @NotBlank(message = "Receiver email is required")
    @Email(message = "Receiver email must be valid")
    private String receiverMail;

    @NotBlank(message = "Sender email is required")
    @Email(message = "Sender email must be valid")
    private String senderMail;

    @NotBlank(message = "Subject is required")
    @Size(max = 200, message = "Subject must not exceed 200 characters")
    private String subject;

    @NotBlank(message = "Message is required")
    @Size(max = 5000, message = "Message must not exceed 5000 characters")
    private String message;

    public EmailRequest() {
    }

    public EmailRequest(String receiverMail, String senderMail, String subject, String message) {
        this.receiverMail = receiverMail;
        this.senderMail = senderMail;
        this.subject = subject;
        this.message = message;
    }

    public String getReceiverMail() {
        return receiverMail;
    }

    public void setReceiverMail(String receiverMail) {
        this.receiverMail = receiverMail;
    }

    public String getSenderMail() {
        return senderMail;
    }

    public void setSenderMail(String senderMail) {
        this.senderMail = senderMail;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
