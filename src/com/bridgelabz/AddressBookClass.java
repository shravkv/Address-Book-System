package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookClass {

    static final Scanner scanner = new Scanner(System.in);
    static final ArrayList<Contacts> contact = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Welcome to AddressBook program");
        AddressBookClass addressBookClass = new AddressBookClass();
        boolean condition = true;
        while (condition) {
            System.out.println("Choose the options \n1.AddContact\n2.EditContact\n3.DeleteContact\n4.AddMultipleContacts\n5.Exit");
            int options = scanner.nextInt();
            switch (options) {
                case 1:
                    addressBookClass.addContact();
                    break;
                case 2:
                    addressBookClass.editContacts();
                    break;
                case 3:
                    addressBookClass.deleteContact();
                    break;
                case 4:
                    addressBookClass.addMultipleContacts();
                    break;
                case 5:
                    condition = false;
                    System.out.println("Exiting the loop....");
                    break;
                default:
                    System.out.println("Enter the correct number");
            }
        }
    }

    public void addContact() {
        Contacts addressBook = new Contacts();
        System.out.println("Enter a first name:");
        addressBook.setFirstName(scanner.next());
        System.out.println("Enter a last name:");
        addressBook.setLastName(scanner.next());
        System.out.println("Enter a Address:");
        addressBook.setAddress(scanner.next());
        System.out.println("Enter a City name:");
        addressBook.setCity(scanner.next());
        System.out.println("Enter a state:");
        addressBook.setState(scanner.next());
        System.out.println("Enter a email:");
        addressBook.setEmail(scanner.next());
        System.out.println("Enter a zip code:");
        addressBook.setZip((scanner.next()));
        System.out.println("Enter a phone number:");
        addressBook.setPhoneNum((scanner.next()));
        contact.add(addressBook);
        System.out.println(contact);
        System.out.println("Contact added success fully");
    }

    public void editContacts() {
        System.out.println("Enter first or last name  to edit ");
        String editName = scanner.next();
        for (int i = 0; i < contact.size(); i++) {
            if (contact.get(i).getFirstName().equals(editName) || contact.get(i).getLastName().equals(editName)) {
                System.out.println("Select options \n1.first name \n2.last name\n3.address\n4.city\n5.state\n6.email\n7.zipcode\n8.phoneNum\n9.Exit ");
                int edit = scanner.nextInt();
                switch (edit) {
                    case 1 -> {
                        System.out.println("Enter first name ");
                        String editFirstName = scanner.next();
                        contact.get(i).setFirstName(editFirstName);
                        System.out.println(editFirstName);
                    }
                    case 2 -> {
                        System.out.println("Enter last name ");
                        String editLastName = scanner.next();
                        contact.get(i).setLastName(editLastName);
                        System.out.println(editLastName);
                    }
                    case 3 -> {
                        System.out.println("Enter Address ");
                        String editAddress = scanner.next();
                        contact.get(i).setAddress(editAddress);
                        System.out.println(editAddress);
                    }
                    case 4 -> {
                        System.out.println("Enter city ");
                        String editCity = scanner.next();
                        contact.get(i).setCity(editCity);
                        System.out.println(editCity);
                    }
                    case 5 -> {
                        System.out.println("Enter state ");
                        String editState = scanner.next();
                        contact.get(i).setState(editState);
                        System.out.println(editState);
                    }
                    case 6 -> {
                        System.out.println("Enter email ");
                        String editEmail = scanner.next();
                        contact.get(i).setEmail(editEmail);
                        System.out.println(editEmail);
                    }
                    case 7 -> {
                        System.out.println("Enter zipcode");
                        String editZip = scanner.next();
                        contact.get(i).setZip((editZip));
                        System.out.println(editZip);
                    }
                    case 8 -> {
                        System.out.println("Enter phone number ");
                        String editPhoneNumber = scanner.next();
                        contact.get(i).setPhoneNum((editPhoneNumber));
                        System.out.println(editPhoneNumber);
                    }
                    default -> System.out.println("Exit the loop");
                }
                System.out.println("Contact edited successfully");
                System.out.println(contact);
            } else {
                System.out.println("Contact not found ");
            }
        }
    }


    public void deleteContact() {
        System.out.println("Enter first or last name to Delete contact");
        String confirmName = scanner.next();
        for (int i = 0; i < contact.size(); i++) {
            if (contact.get(i).getFirstName().equals(confirmName) || contact.get(i).getLastName().equals(confirmName)) {
                Contacts person = contact.get(i);
                contact.remove(person);
                System.out.println("Contact delete successfully");
            } else {
                System.out.println("Contact not found in AddressBook");
            }

            System.out.println(contact);
        }
    }

    public void addMultipleContacts() {
        System.out.println("Enter number of contacts added to the AddressBook");
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            addContact();
            System.out.println(i + 1 + "-->Contact added successfully");
        }
    }
}
