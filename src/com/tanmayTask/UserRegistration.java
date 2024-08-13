package com.tanmayTask;

public class UserRegistration {

   public  void registerUser(String name,String email)
   {
       // Creating new User Object.
       User user=new User(name,email);

       EmailService emailService=new EmailService();
       emailService.sendWelcomeEmail(user);
   }

    public static void main(String[] args) {
        UserRegistration userRegistration=new UserRegistration();

        userRegistration.registerUser("Utkarsh","utkarsh.khalkar@gmail.com");
    }

}
