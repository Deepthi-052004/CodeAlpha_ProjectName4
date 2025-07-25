import java.io.*;
import java.util.*;

public class BookingManager {
    private List<Room> rooms;
    private List<Booking> bookings;

    public BookingManager() {
        rooms = new ArrayList<>();
        bookings = new ArrayList<>();
        initializeRooms();
    }

    private void initializeRooms() {
        for (int i = 1; i <= 5; i++) rooms.add(new Room(i, Room.Category.STANDARD));
        for (int i = 6; i <= 8; i++) rooms.add(new Room(i, Room.Category.DELUXE));
        for (int i = 9; i <= 10; i++) rooms.add(new Room(i, Room.Category.SUITE));
    }

    public void showAvailableRooms() {
        for (Room room : rooms) {
            if (room.isAvailable()) System.out.println(room);
        }
    }

    public void bookRoom(String customerName, Room.Category category) {
        for (Room room : rooms) {
            if (room.isAvailable() && room.getCategory() == category) {
                room.setAvailable(false);
                Booking booking = new Booking(customerName, room);
                bookings.add(booking);
                saveBookingToFile(booking);
                System.out.println("Booking successful: " + booking);
                return;
            }
        }
        System.out.println("No available rooms in " + category + " category.");
    }

    public void cancelBooking(String customerName) {
        Iterator<Booking> it = bookings.iterator();
        while (it.hasNext()) {
            Booking booking = it.next();
            if (booking.getCustomerName().equalsIgnoreCase(customerName)) {
                booking.getRoom().setAvailable(true);
                it.remove();
                System.out.println("Booking cancelled for " + customerName);
                return;
            }
        }
        System.out.println("No booking found for " + customerName);
    }

    public void saveBookingToFile(Booking booking) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("bookings.txt", true))) {
            bw.write(booking.toString());
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Error writing booking to file.");
        }
    }

    public void viewBookings() {
        System.out.println("Current Bookings:");
        for (Booking booking : bookings) {
            System.out.println(booking);
        }
    }
}
