import object.Book;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the title of the book: ");
        String bTitle = scanner.nextLine();

        System.out.print("Enter the author of the book: ");
        String baAuthor = scanner.nextLine();

        System.out.print("Enter the publication year of the book: ");
        int bBublicationYear = scanner.nextInt();

        Book book = new Book(bTitle, baAuthor, bBublicationYear);

        // Displaying information about the book
        System.out.println("\nBook Information:");
        System.out.println("Title: " + book.getBookTitle());
        System.out.println("Author: " + book.getBookAuthor());
        System.out.println("Publication Year: " + book.getBookPublicationYear());

    }
}