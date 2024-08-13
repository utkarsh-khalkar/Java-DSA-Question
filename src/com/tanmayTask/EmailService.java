package com.tanmayTask;

public class EmailService {

    public  void sendWelcomeEmail(User user)
    {
        String subject=" Welcome to Our Company!";
        String body = "Hi " + user.getName() + ",\n\n" +
                "Thank you for registering with us. We're excited to have you on board.\n\n" +
                "Best regards,\nThe Team";

        System.out.println("Email Sent to " + user.getEmail());
        System.out.println("Subject: " + subject);
        System.out.println("Body:");
        System.out.println(body);
        System.out.println("----------------------------------------");
    }
}
