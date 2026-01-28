package level3;

public class EBook extends Book {

    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    public void displayDetails() {
        System.out.println("ISBN  : " + ISBN);   // public
        System.out.println("Title : " + title);  // protected
        System.out.println("Author: " + getAuthor()); // private via method
    }
}

