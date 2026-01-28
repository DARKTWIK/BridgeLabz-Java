package level1;

public class BookMain {

    public static void main(String[] args) {

        // Using default constructor
        Book book1 = new Book();

        // Using parameterized constructor
        Book book2 = new Book("Effective Java", "Joshua Bloch", 650);

        System.out.println("Book 1 Details:");
        book1.displayDetails();

        System.out.println("\nBook 2 Details:");
        book2.displayDetails();
    }
}

