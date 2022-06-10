import java.util.Arrays;
import java.util.Scanner;

    public class AddContact {

        private static Scanner scanner = new Scanner(System.in);
        private static Book[] books = new Book[2];

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
            System.out.println("Enter phone number ");
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

        public static void main(String[] args) {
            System.out.println("Welcome to Address Book Program ");
            AddContact.createContact();
            System.out.println(Arrays.toString(books));
        }
    }
