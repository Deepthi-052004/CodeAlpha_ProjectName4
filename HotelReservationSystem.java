import java.util.Scanner;

public class HotelReservationSystem {
    public static void main(String[] args) {
        BookingManager manager = new BookingManager();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Hotel Reservation System ---");
            System.out.println("1. View Available Rooms");
            System.out.println("2. Book a Room");
            System.out.println("3. Cancel Booking");
            System.out.println("4. View All Bookings");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    manager.showAvailableRooms();
                    break;
                case 2:
                    System.out.print("Enter your name: ");
                    String name = sc.nextLine();
                    System.out.println("Select Room Category: 1. Standard  2. Deluxe  3. Suite");
                    int type = sc.nextInt();
                    Room.Category category = Room.Category.values()[type - 1];
                    manager.bookRoom(name, category);
                    break;
                case 3:
                    System.out.print("Enter your name to cancel booking: ");
                    String cancelName = sc.nextLine();
                    manager.cancelBooking(cancelName);
                    break;
                case 4:
                    manager.viewBookings();
                    break;
                case 5:
                    System.out.println("Thank you for using the system!");
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
