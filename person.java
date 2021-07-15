package com.capstone;

public class person {

    //attributes
    private String name;
    private String surName;
    private String phoneNumber;
    private String emailAddress;
    private String physicalAddress;

    //constructor
    public person(String name, String surName, String phoneNumber, String emailAddress, String physicalAddress) {
        this.name = name;
        this.surName = surName;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.physicalAddress = physicalAddress;
    }

    //Getters
    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPhysicalAddress() {
        return physicalAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    //Setters
    public void setPhysicalAddress(String physicalAddress) {
        this.physicalAddress = physicalAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setName(String name) {
        this.name = name;
    }

    //toString method
    public String toString() {
        String output = "Name: " + name;
        output += "\nSurname: " + surName;
        output += "\nPhone Number: " + phoneNumber;
        output += "\nEmail: " + emailAddress;
        output += "\nAddress: " + physicalAddress;

        return output;
    }
}
