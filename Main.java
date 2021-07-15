package com.capstone;
import java.util.*;

public class Main {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

            //reading values and storing them in the person class attributes for the customer
            System.out.println("Enter the Customers Name: ");
            String name = input.nextLine();

            System.out.println("Enter Customers Surname: ");
            String surName = input.nextLine();

            System.out.println("Enter Customers Phone Number: ");
            String phoneNumber = input.nextLine();

            System.out.println("Enter Customers Email: ");
            String emailAddress = input.nextLine();

            System.out.println("Enter Customers Address: ");
            String physicalAddress = input.nextLine();

            person Customer = new person(name, surName, phoneNumber, emailAddress, physicalAddress);
            System.out.println(Customer);

            //reading values and storing them in the person class attributes for the contractor
            System.out.println("Enter Contractor's Name: ");
            name = input.nextLine();

            System.out.println("Enter Contractors Surname: ");
            surName = input.nextLine();

            System.out.println("Enter Contractors Phone Number: ");
            phoneNumber = input.nextLine();

            System.out.println("Enter Contractors Email: ");
            emailAddress = input.nextLine();

            System.out.println("Enter Contractors Address: ");
            physicalAddress = input.nextLine();

            person Contractor = new person(name, surName, phoneNumber, emailAddress, physicalAddress);
            System.out.println(Contractor);

            //reading values and storing them in the person class attributes for the architect
            System.out.println("Enter Architects Name: ");
            name = input.nextLine();

            System.out.println("Enter Architects Surname: ");
            surName = input.nextLine();

            System.out.println("Enter Architects phone number: ");
            phoneNumber = input.nextLine();

            System.out.println("Enter Architects Email: ");
            emailAddress = input.nextLine();

            System.out.println("Enter Architects Address: ");
            physicalAddress = input.nextLine();

            person Architect = new person(name, surName, phoneNumber, emailAddress, physicalAddress);
            System.out.println(Architect);


        //reading data and saving them as attributes from the project class
        System.out.println("Enter Project Number: ");
        int projNum = input.nextInt();
        input.nextLine();

        System.out.println("Enter Project Name: ");
        String projName = input.nextLine();

        System.out.println("Enter Building Type: ");
        String buildType = input.nextLine();

        System.out.println("Enter Projects Address: ");
        String projAdd = input.nextLine();

        System.out.println("Enter the ERF Number: ");
        String erfNum = input.nextLine();

        System.out.println("Enter the Projects Fee: ");
        long projFee = input.nextLong();
        input.nextLine();

        System.out.println("Enter the total amount paid: ");
        long totPaid = input.nextLong();
        input.nextLine();

        System.out.println("Enter the Deadline date: ");
        String dDate = input.nextLine();

        project Poised = new project(projNum, projName, buildType, projAdd, erfNum, projFee, totPaid, dDate);
        System.out.println(Poised);

        //Creating a menu
        System.out.println("Update Menu: ");
        System.out.println("uc = Update Contractors Details: ");
        System.out.println("uf = Update amount fee paid to date: ");
        System.out.println("ud = Update Duedate of the project: ");

        String menu = input.nextLine();

        //if statement to update contractors details
        if(menu.equals("uc")) {
            System.out.println("Update Contractors Name: ");
            String newName = input.nextLine();

            System.out.println("Update Contractors Surname: ");
            String newSurName = input.nextLine();

            System.out.println("Update Contractors Phone Number ");
            String newPhoneNumber = input.nextLine();

            System.out.println("Update Contractors Email: ");
            String newEmail = input.nextLine();

            System.out.println("Update Contractors Address: ");
            String newAddress = input.nextLine();

            //Updating the attribute values with the set method
            Contractor.setName(newName);
            Contractor.setSurName(newSurName);
            Contractor.setPhoneNumber(newPhoneNumber);
            Contractor.setEmailAddress(newEmail);
            Contractor.setPhysicalAddress(newAddress);

            System.out.println(Contractor);
        }

        //if statement to update amount fee paid
        if(menu.equals("uf")) {
            System.out.println("Enter the Updated amount paid: ");
            long newFee = input.nextLong();
            Poised.setProjFee(newFee); //using setProjFee to update the fee paid
            System.out.println(Poised);
        }

        //if statement to update the deadline date
        if(menu.equals("ud")) {
            System.out.println("Enter Updated Deadline Date: ");
            String newDLine = input.nextLine();
            Poised.setdDate(newDLine); //using setdDate method to update the deadline
            System.out.println(Poised);
        }
    }
}
