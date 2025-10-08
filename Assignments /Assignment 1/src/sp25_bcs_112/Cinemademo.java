package sp25_bcs_112;
public class Cinemademo{

public static void main(String[] args){
Cinema c = new Cinema("Zayeem Cineplex", 2);
        c.addScreen("Gold");
        c.addScreen("Silver");

        System.out.println(c);
        c.displayAllLayouts();

        System.out.println("\nBooking R1-001 in Gold:");
        c.bookSeat("Gold", 1, 1);

        System.out.println("\nAfter booking:");
        c.displayAllLayouts();

        System.out.println("\nCancel same seat:");
        c.cancelSeat("Gold", 1, 1);

        System.out.println("\nAfter cancel:");
        c.displayAllLayouts();

        System.out.println("\nAvailable VIP seats in all screens: " + c.getAvailableSeats(SeatType.VIP));
    }

}
