package level2;
public class MovieTicketMain {
    public static void main(String[] args) {

        MovieTicket ticket = new MovieTicket("Inception");

        ticket.bookTicket(25, 350);
        ticket.displayDetails();
    }
}
