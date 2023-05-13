package com.bridgelabz.addressbooksystem;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    static int temp = 0;

    ArrayList<Contact> personList = new ArrayList<>();

    public void addContact() {
        Contact contact = new Contact();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Name");
        String firstName = scanner.next();
        System.out.println("Enter Last Name");
        String lastName = scanner.next();
        System.out.println("Enter Address");
        String address = scanner.next();
        System.out.println("Enter City");
        String city = scanner.next();
        System.out.println("Enter State");
        String state = scanner.next();
        System.out.println("Enter Zip Code");
        Integer zip = scanner.nextInt();
        System.out.println("Enter Phone Number");
        Long phN = scanner.nextLong();
        System.out.println("Enter Email Id");
        String emailId = scanner.next();
        contact.setFirstName(firstName);
        contact.setLastName(lastName);
        contact.setAddress(address);
        contact.setCity(city);
        contact.setState(state);
        contact.setZip(zip);
        contact.setPhN(phN);
        contact.setEmailId(emailId);

        if(temp > 0) {
            if (personList.stream().anyMatch(contact1-> contact1.getFirstName().equals(firstName)))
                System.out.println("Person Already Exist");
            else
                personList.add(contact);
        }else
            personList.add(contact);
        temp++;
    }

    @Override
    public String toString() {
        return "AddressBook{" +
                "personList=" + personList +
                '}';
    }
}

