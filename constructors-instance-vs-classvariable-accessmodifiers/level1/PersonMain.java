package level1;

public class PersonMain {

    public static void main(String[] args) {

        Person original = new Person("Sasi Kiran", 21);

        // Copy constructor
        Person copy = new Person(original);

        System.out.println("Original Person:");
        original.display();

        System.out.println("Copied Person:");
        copy.display();
    }
}

