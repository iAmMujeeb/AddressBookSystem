package com.bridgelabz.addressbooksystem;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    ArrayList<Contact> personList = new ArrayList<>();

    public void addContact() {
        Contact contact = new Contact();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter FN");
        String firstName = scanner.next();
        System.out.println("Enter LN");
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
        contact.setCity(firstName);
        contact.setLastName(lastName);
        contact.setAddress(address);
        contact.setCity(city);
        contact.setState(state);
        contact.setZip(zip);
        contact.setPhN(phN);
        contact.setEmailId(emailId);
        personList.add(contact);
    }

    @Override
    public String toString() {
        return "AddressBook{" +
                "personList=" + personList +
                '}';
    }
}

