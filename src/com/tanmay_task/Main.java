package com.tanmay_task;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserRegister userRegister=new UserRegister();
      //  userRegister.registerUser("Utkarsh","utkarsh.khallkar@gmail.com","9921936054","Pune","Kunal","Bank Management","Mumbai");

        Scanner s1=new Scanner(System.in);
        String choice="yes";

        do {
            System.out.println("Enter the Name:");
            String name=s1.next();
            System.out.println("Enter the Email:");
            String email=s1.next();
            System.out.println("Enter the Contact Number:");
            String contact=s1.next();
            System.out.println("Enter the Location:");
            String location=s1.next();
            System.out.println("Enter the Project Manager Name:");
            String project_manager=s1.next();
            System.out.println("Enter the Project Name");
            String project=s1.next();
            System.out.println("Enter the Project Location:");
            String project_location=s1.next();

            userRegister.registerUser(name,email,contact,location,project_manager,project,project_location);
            System.out.println("Do you want Continue (Enter Yes/No)");
            choice=s1.next();
        }while (choice.equalsIgnoreCase("yes"));
    }
}
