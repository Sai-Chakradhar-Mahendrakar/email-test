package com.emailtest.service.dto;

public class EmailRequest {
    private String receiverMail;
    private String senderMail;
    private String subject;
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
