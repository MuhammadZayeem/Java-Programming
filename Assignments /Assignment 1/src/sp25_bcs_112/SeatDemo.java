package sp25_bcs_112;

public class SeatDemo {
    public static void main(String[] args) {

        System.out.println("=============================================");
        System.out.println("         Seat Class Demonstration");
        System.out.println("=============================================");

        // Construct seats of different types
        Seat s1 = new Seat("R1-001", SeatType.REGULAR, 500, true);
        Seat s2 = new Seat("R2-001", SeatType.PREMIUM, 750, true);
        Seat s3 = new Seat("R3-001", SeatType.VIP, 1000, true);
        Seat s4 = new Seat("R4-001", SeatType.RECLINER, 1200, true);

        System.out.println(s1.display());
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

        // Booking demonstration
        System.out.println("\n>>> Booking seat R2-001...");
        s2.bookSeat();
        System.out.println(s2);

        // Cancel booking
        System.out.println("\n>>> Cancelling seat R2-001...");
        s2.cancelBooking();
        System.out.println(s2);

        // Adjust price
        System.out.println("\n>>> Updating VIP seat price...");
        s3.setprice(1100);
        System.out.println(s3);

        System.out.println("\n>>> Availability symbols:");
        System.out.println(s1.getseatID() + " → " + s1.display_availabilitysymbol());
        System.out.println(s2.getseatID() + " → " + s2.display_availabilitysymbol());
        System.out.println(s3.getseatID() + " → " + s3.display_availabilitysymbol());
        System.out.println(s4.getseatID() + " → " + s4.display_availabilitysymbol());
    }
}
