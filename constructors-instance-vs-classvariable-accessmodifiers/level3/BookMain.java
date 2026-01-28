package level3;

public class BookMain {

    public static void main(String[] args) {

        EBook ebook = new EBook("978-12345", "Java Programming", "Herbert");

        ebook.setAuthor("Herbert Schildt");
        ebook.displayDetails();
    }
}

