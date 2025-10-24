# Email Sender Service

A Spring Boot REST API service for sending emails using Spring JavaMail with Gmail SMTP.

## Features

- Send emails via REST API
- Gmail SMTP integration
- Configurable sender and receiver emails
- RESTful endpoint

## Prerequisites

- Java 17 or higher
- Maven 3.6 or higher
- Gmail account with App Password

## Gmail Setup

To use this service with Gmail, you need to:

1. Enable 2-Step Verification on your Google Account
2. Generate an App Password:
   - Go to your Google Account settings
   - Navigate to Security > 2-Step Verification > App passwords
   - Generate a new app password for "Mail"
   - Use this password in the configuration

## Configuration

Set the following environment variables before running the application:

```bash
export MAIL_USERNAME=your-email@gmail.com
export MAIL_PASSWORD=your-app-password
```

Alternatively, you can configure them in `src/main/resources/application.properties`.

## Build

```bash
mvn clean package
```

## Run

```bash
mvn spring-boot:run
```

Or run the JAR file:

```bash
java -jar target/email-sender-service-1.0.0.jar
```

The application will start on port 8080 by default.

## API Usage

### Send Email

**Endpoint:** `POST /api/email/send`

**Request Body:**
```json
{
  "receiverMail": "recipient@example.com",
  "senderMail": "sender@gmail.com",
  "subject": "Test Email",
  "message": "This is a test email from Spring Boot Email Sender Service"
}
```

**Example using cURL:**
```bash
curl -X POST http://localhost:8080/api/email/send \
  -H "Content-Type: application/json" \
  -d '{
    "receiverMail": "recipient@example.com",
    "senderMail": "sender@gmail.com",
    "subject": "Test Email",
    "message": "Hello from Email Sender Service!"
  }'
```

**Success Response:**
```
Email sent successfully!
```

**Error Response:**
```
Failed to send email: <error message>
```

## Project Structure

```
email-sender-service/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/emailtest/service/
│   │   │       ├── EmailSenderServiceApplication.java
│   │   │       ├── controller/
│   │   │       │   └── EmailController.java
│   │   │       ├── dto/
│   │   │       │   └── EmailRequest.java
│   │   │       └── service/
│   │   │           └── EmailService.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       └── java/
│           └── com/emailtest/service/
│               └── EmailSenderServiceApplicationTests.java
└── pom.xml
```

## Technologies Used

- Spring Boot 3.1.5
- Spring Boot Starter Web
- Spring Boot Starter Mail
- JavaMail API
- Maven

## License

This project is open source and available under the MIT License.