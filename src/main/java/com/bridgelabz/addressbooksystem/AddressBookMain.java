package com.bridgelabz.addressbooksystem;

import java.util.*;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        Map<String, AddressBook> map1 = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Address Book Name => ");
        String name1 = scanner.next();
        ArrayList<AddressBook> addressBook = new ArrayList<>();
        AddressBook addressBook1 = new AddressBook();
        addressBook1.addContact();
        addressBook1.addContact();
        addressBook1.addContact();
        addressBook.add(addressBook1);
        map1.put(name1,addressBook1);
        System.out.println("Enter Second Address Book Name => ");
        String name2 = scanner.next();
        AddressBook addressBook2 = new AddressBook();
        addressBook2.addContact();
        addressBook2.addContact();
        addressBook2.addContact();
        addressBook.add(addressBook2);
        map1.put(name2,addressBook2);
        System.out.println("Enter Third Address Book Name => ");
        String name3 = scanner.next();
        AddressBook addressBook3 = new AddressBook();
        addressBook3.addContact();
        addressBook3.addContact();
        addressBook3.addContact();
        addressBook.add(addressBook3);
        map1.put(name3,addressBook3);
    }
}
