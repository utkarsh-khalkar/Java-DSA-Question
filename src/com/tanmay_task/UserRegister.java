package com.tanmay_task;

public class UserRegister {
    public void registerUser(String name, String email, String contact, String location, String reporting_Manager, String projectName, String project_location )
    {
        User user=new User( name, email,  contact, location,  reporting_Manager,  projectName,  project_location);

        EmailService emailService=new EmailService();
        emailService.sendEmail(user);

        emailService.displayUser(user);
        System.out.println("Thanks for the Registration..");

    }


}
