package level1;

public class HotelBookingMain {

    public static void main(String[] args) {

        // Default constructor
        HotelBooking booking1 = new HotelBooking();

        // Parameterized constructor
        HotelBooking booking2 = new HotelBooking("Sasi Kiran", "Deluxe", 3);

        // Copy constructor
        HotelBooking booking3 = new HotelBooking(booking2);

        System.out.println("Booking 1:");
        booking1.displayBooking();

        System.out.println("\nBooking 2:");
        booking2.displayBooking();

        System.out.println("\nBooking 3 (Copied):");
        booking3.displayBooking();
    }
}

