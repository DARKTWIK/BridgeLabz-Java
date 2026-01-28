package level2;

public class MovieTicket {

    private String movieName;
    private int seatNumber;
    private double price;
    private boolean booked;

    public MovieTicket(String movieName) {
        this.movieName = movieName;
        this.booked = false;
    }

    public void bookTicket(int seatNumber, double price) {
        if (!booked) {
            this.seatNumber = seatNumber;
            this.price = price;
            this.booked = true;
            System.out.println("Ticket booked successfully.");
        } else {
            System.out.println("Ticket already booked!");
        }
    }

    public void displayDetails() {
        if (booked) {
            System.out.println("Movie : " + movieName);
            System.out.println("Seat  : " + seatNumber);
            System.out.println("Price : " + price);
        } else {
            System.out.println("No ticket booked yet.");
        }
    }
}

