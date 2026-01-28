package level1;

public class CircleMain {

    public static void main(String[] args) {

        // Default constructor (radius = 1.0)
        Circle circle1 = new Circle();

        // Parameterized constructor
        Circle circle2 = new Circle(5.0);

        System.out.println("Circle 1 Area: " + circle1.calculateArea());
        System.out.println("Circle 2 Area: " + circle2.calculateArea());
    }
}

