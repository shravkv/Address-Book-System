import java.util.Arrays;
import java.util.Scanner;



public class MultiplePerson {

    private static Scanner scanner = new Scanner(System.in);
    private static Book[] books = new Book[10];

    private static Book createContact() {
        Book book = new Book();
        System.out.println("Enter first name ");
        book.setFirstName(scanner.nextLine());
        System.out.println("Enter last name ");
        book.setLastName(scanner.nextLine());
        System.out.println("Enter address ");
        book.setAddress(scanner.nextLine());
        System.out.println("Enter city ");
        book.setCity(scanner.nextLine());
        System.out.println("Enter state ");
        book.setCity(scanner.nextLine());
        System.out.println("Enter email ");
        book.setEmail(scanner.nextLine());
        System.out.println("Enter phone num ");
        book.setPhoneNum(Integer.parseInt(scanner.nextLine()));
        System.out.println("Enter zip ");
        book.setZip(Integer.parseInt(scanner.nextLine()));
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                System.out.println("Contact added successfully");
                return book;
            }
        }

        System.out.println("No space for new contact");
        return book;
    }

    private static Book editContact(Book book) {
        System.out.println("Edit first name");
        book.setFirstName(scanner.nextLine());
        System.out.println("Enter last name");
        book.setLastName(scanner.nextLine());
        System.out.println("Enter address");
        book.setAddress(scanner.nextLine());
        System.out.println("Enter city");
        book.setCity(scanner.nextLine());
        System.out.println("Enter state");
        book.setState(scanner.nextLine());
        System.out.println("Enter Email");
        book.setEmail(scanner.nextLine());
        System.out.println("Enter phone num");
        book.setPhoneNum(Integer.parseInt(scanner.nextLine()));
        System.out.println("Enter zip");
        book.setZip(Integer.parseInt(scanner.nextLine()));
        return book;
    }

    private static int findContactByName(String name) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                String String;
                if (books[i].getFirstName().equals(name) || books[i].getLastName().equals(name)) {
                    return i;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program ");
        boolean isExit = false;
        while (!isExit) {
            System.out.println("Please select options\n1. add contact\n2. edit contact ln 3.Delete contact");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    createContact();
                    System.out.println(Arrays.toString(books));
                    break;
                case 2:
                    System.out.println("Enter name to edit");
                    String name = scanner.nextLine();
                    int booksIntex = findContactByName(name);
                    System.out.println(booksIntex);
                    if (booksIntex == -1) {
                        System.out.println("Contact not found with name: " + name);
                    } else {
                        Book contact = editContact(books[booksIntex]);
                        books[booksIntex] = contact;
                    }
                    System.out.println(Arrays.toString(books));
                    break;
                case 3:
                    System.out.println("Enter name to delete");
                    name = scanner.nextLine();
                    int contactIndexForDelete = findContactByName(name);
                    if (contactIndexForDelete == -1) {
                        System.out.println("Contact not found with name: " + name);
                    } else {
                        books[contactIndexForDelete] = null;
                    }
                    System.out.println(Arrays.toString(books));
                    break;
                default:
                    System.out.println("Please select valid input");
            }

        }

    }

}


