public class Room {
    public enum Category { STANDARD, DELUXE, SUITE }

    private int roomNumber;
    private Category category;
    private boolean isAvailable;

    public Room(int roomNumber, Category category) {
        this.roomNumber = roomNumber;
        this.category = category;
        this.isAvailable = true;
    }

    public int getRoomNumber() { return roomNumber; }
    public Category getCategory() { return category; }
    public boolean isAvailable() { return isAvailable; }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    @Override
    public String toString() {
        return "Room #" + roomNumber + " (" + category + ") - " + (isAvailable ? "Available" : "Booked");
    }
}