package com.bridgelabz;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AdressBook {

    static Map<String, AddressBookClass> bookClassMap = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);
    static AddressBookClass addressBook = new AddressBookClass();

    public static void main(String[] args) {

        System.out.println("Welcome To AddressBook program");
        boolean condition = true;
        while (condition) {
            System.out.println("choose options \n1 : AddNewAddressBook\n2 : AddContact\n3 : EditContact\n4 : Delete Contact\n5 : Add multiple contacts\n6 : Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addAddressBook();
                    break;
                case 2:
                    addAddressBookContact();
                    break;
                case 3:
                    editAddressBookContact();
                    break;
                case 4:
                    deleteAddressBookContact();
                    break;
                case 5:
                    addMultipleContactsToAddressBook();
                    break;
                case 6:
                    condition = false;
                    System.out.println("Exiting the loop ");
                default:
                    System.out.println("Enter the correct number");
            }
        }
    }


    public static void addAddressBook() {
        System.out.println("Create a New Address Book\nEnter the New AddressBook name");
        String bookName = scanner.next();
        AddressBookClass book = bookClassMap.get(bookName);
        if (book == null) {
            bookClassMap.put(bookName, addressBook);
            System.out.println(bookClassMap.entrySet());
            System.out.println("SuccessFully added New AddressBook");
        } else {
            System.out.println("AddressBook with this name already exists ");
        }
    }

    public static void addAddressBookContact() {
        System.out.println("Enter the AddressBook Name");
        String bookName = scanner.next();
        AddressBookClass book = bookClassMap.get(bookName);
        if (book == null) {
            System.out.println("No Book found with these name");
        } else {
            addressBook.addContact();
        }
    }

    public static void editAddressBookContact() {
        System.out.println("Enter the AddressBook Name");
        String bookName = scanner.next();
        AddressBookClass book = bookClassMap.get(bookName);
        if (book == null) {
            System.out.println("No Book found with these name");
        } else {
            addressBook.editContacts();
        }
    }

    public static void deleteAddressBookContact() {
        System.out.println("Enter the AddressBook Name");
        String bookName = scanner.next();
        AddressBookClass book = bookClassMap.get(bookName);
        if (book == null) {
            System.out.println("No Book found with these name");
        } else {
            addressBook.deleteContact();
        }
    }

    public static void addMultipleContactsToAddressBook() {
        System.out.println("Enter the AddressBook Name");
        String bookName = scanner.next();
        AddressBookClass book = bookClassMap.get(bookName);
        if (book == null) {
            System.out.println("No Book found with these name");
        } else {
            addressBook.addMultipleContacts();
        }
    }

}
}
