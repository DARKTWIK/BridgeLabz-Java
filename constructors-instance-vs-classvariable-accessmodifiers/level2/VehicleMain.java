package level2;

public class VehicleMain {

    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("Sasi Kiran", "Car");
        Vehicle v2 = new Vehicle("Ravi", "Bike");

        v1.displayVehicleDetails();
        System.out.println();

        // Update registration fee for all vehicles
        Vehicle.updateRegistrationFee(2000);

        v2.displayVehicleDetails();
    }
}
