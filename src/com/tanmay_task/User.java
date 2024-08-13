package com.tanmay_task;

public class User {
    private  String name;
    private  String email;
    private  String contact;
    private  String location;
    private String reporting_Manager;
    private String projectName;
    private  String project_location;

    public User() {
    }

    public User(String name, String email, String contact, String location, String reporting_Manager, String projectName, String project_location) {
        this.name = name;
        this.email = email;
        this.contact = contact;
        this.location = location;
        this.reporting_Manager = reporting_Manager;
        this.projectName = projectName;
        this.project_location = project_location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getReporting_Manager() {
        return reporting_Manager;
    }

    public void setReporting_Manager(String reporting_Manager) {
        this.reporting_Manager = reporting_Manager;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProject_location() {
        return project_location;
    }

    public void setProject_location(String project_location) {
        this.project_location = project_location;
    }
}
