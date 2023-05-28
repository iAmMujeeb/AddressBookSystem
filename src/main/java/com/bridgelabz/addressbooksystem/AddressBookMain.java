package com.bridgelabz.addressbooksystem;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

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

        List<Contact> persons = new ArrayList<>();
                map1.values().stream().forEach(addressBook4 -> {
                    List<Contact> tempList = addressBook4.personList.stream().filter(contact -> contact.getCity().equals("Mumbai")).collect(Collectors.toList());
                persons.addAll(tempList);
                });
        System.out.println(persons);

        List<Contact> cityPersons = new ArrayList<>();
        map1.values().stream().forEach(addressBook5 -> {
            List<Contact> tempList1 = addressBook5.cityDict.get("Mumbai").stream().toList();
            cityPersons.addAll(tempList1);
        });
        System.out.println(cityPersons);

        List<Contact> statePersons = new ArrayList<>();
        map1.values().stream().forEach(addressBook5 -> {
            List<Contact> tempList1 = addressBook5.stateDict.get("Maharashtra").stream().toList();
            statePersons.addAll(tempList1);
        });
        System.out.println(statePersons);

        AtomicLong personsCityCount = new AtomicLong();
        map1.values().stream().forEach(addressBook5 -> {
            personsCityCount.set(addressBook5.cityDict.get("Mumbai").stream().count());
        });
        System.out.println(personsCityCount);


        AtomicLong personsStateCount = new AtomicLong();
        map1.values().stream().forEach(addressBook5 -> {
            personsStateCount.set(addressBook5.stateDict.get("Maharashtra").stream().count());
        });
        System.out.println(personsStateCount);

        List<Contact> personNameSortedList = new ArrayList<>();
        map1.values().stream().forEach(AddressBook->{
            List<Contact> tempList =  AddressBook.personList.stream().sorted(Comparator.comparing(Contact::getFirstName)).collect(Collectors.toList());
            personNameSortedList.addAll(tempList);
        });

        System.out.println(personNameSortedList);

        List<Contact> cityNameSortedList = new ArrayList<>();
        map1.values().stream().forEach(AddressBook->{
            List<Contact> tempList =  AddressBook.personList.stream().sorted(Comparator.comparing(Contact::getCity)).collect(Collectors.toList());
            cityNameSortedList.addAll(tempList);
        });

        System.out.println(cityNameSortedList);

        List<Contact> stateNameSortedList = new ArrayList<>();
        map1.values().stream().forEach(AddressBook->{
            List<Contact> tempList =  AddressBook.personList.stream().sorted(Comparator.comparing(Contact::getState)).collect(Collectors.toList());
            stateNameSortedList.addAll(tempList);
        });

        System.out.println(stateNameSortedList);

        List<Contact> zipSortedList = new ArrayList<>();
        map1.values().stream().forEach(AddressBook->{
            List<Contact> tempList =  AddressBook.personList.stream().sorted(Comparator.comparingInt(Contact::getZip)).collect(Collectors.toList());
            zipSortedList.addAll(tempList);
        });

        System.out.println(zipSortedList);

    }
}
