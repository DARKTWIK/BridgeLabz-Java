package level1;

public class CarRentalMain {

    public static void main(String[] args) {

        // Default constructor
        CarRental rental1 = new CarRental();

        // Parameterized constructor
        CarRental rental2 = new CarRental("Sasi Kiran", "Sedan", 4);

        System.out.println("Rental 1:");
        rental1.displayRental();

        System.out.println("\nRental 2:");
        rental2.displayRental();
    }
}


