package sp25_bcs_112;
public class Run {
    public static void main(String[] args) {
        CityCinema city = new CityCinema("Lahore", 3);

        city.addCinema("RoyalCine", 2);
        city.addCinema("GrandLux", 3);

        System.out.println(city);
        city.displayAll();

        System.out.println("\nBooking VIP seat in RoyalCine > Gold > row 3 seat 1:");
        city.bookSeat("RoyalCine", "Gold", 3, 1);

        System.out.println("\nFinding first available VIP seat in city:");
        System.out.println(city.findFirstVIPSeat());

        System.out.println("\nAfter Booking:");
        city.displayAll();
    }
}
