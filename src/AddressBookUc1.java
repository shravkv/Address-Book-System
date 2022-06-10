// import java.awt.print.Book;
import java.util.Scanner;

public class AddressBookUc1 {

    private static Scanner scanner = new Scanner(System.in);

    private static Book addContact() {
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

        return book;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program ");
        Book book = addContact();
        System.out.println(book);
    }
}
