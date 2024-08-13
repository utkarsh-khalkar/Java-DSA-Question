package com.tanmay_task;

public class EmailService {

    public void  sendEmail(User user)
    {
        System.out.println("Email Sent to:"+user.getName());
    }
    public void displayUser( User user)
    {
        System.out.println("User Name:"+user.getName());
        System.out.println("User Name:"+user.getEmail());
        System.out.println("User Contact Number:"+user.getContact());
        System.out.println("User Location:"+user.getLocation());
        System.out.println("User Manager:"+user.getReporting_Manager());
        System.out.println("User Project Name:"+user.getProjectName());
        System.out.println("User Project Location:"+user.getProject_location());
        System.out.println();
    }
}
