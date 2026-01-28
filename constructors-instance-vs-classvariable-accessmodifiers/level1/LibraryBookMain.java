package level1;

public class LibraryBookMain {

    public static void main(String[] args) {

        LibraryBook book = new LibraryBook("OOP in Java", "Balagurusamy", 450);

        book.displayDetails();

        System.out.println("\nBorrowing the book...");
        book.borrowBook();

        System.out.println("\nAfter borrowing:");
        book.displayDetails();
    }
}

