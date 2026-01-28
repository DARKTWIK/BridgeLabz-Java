package level1;

public class CarRental {

    private String customerName;
    private String carModel;
    private int rentalDays;
    private double costPerDay = 1500;

    // Default constructor
    public CarRental() {
        this("Customer", "Hatchback", 1);
    }

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public double calculateTotalCost() {
        return rentalDays * costPerDay;
    }

    public void displayRental() {
        System.out.println(customerName + " | " + carModel + " | Days: " + rentalDays);
        System.out.println("Total Cost: " + calculateTotalCost());
    }
}
