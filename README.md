# CodeAlpha_ProjectName4
# 🏨 Hotel Reservation System

A simple Java console-based application that allows users to **search, book, cancel**, and **view hotel room reservations**. Built using **Object-Oriented Programming (OOP)** principles with **File I/O** for data persistence.

## 📌 Features

- 🔍 Search available hotel rooms
- 🛏️ Book a room by category (Standard, Deluxe, Suite)
- ❌ Cancel a reservation
- 💳 Simulate a simple booking/payment process
- 📂 Save booking details to a text file (`bookings.txt`)
- 🧱 Designed using OOP (Classes: `Room`, `Booking`, `BookingManager`)
- 💾 File-based data storage (No database used)

## 🛠️ Technologies Used

- 💻 Java (JDK 8+)
- 🗃️ File I/O for storing booking details
- 🧱 Object-Oriented Design

## 📁 Project Structure

```
HotelReservationSystem/
├── Room.java               // Room class (room details and availability)
├── Booking.java            // Booking class (customer and room info)
├── BookingManager.java     // Core logic (book/cancel/view/save)
├── HotelReservationSystem.java  // Main class with console UI
├── bookings.txt            // Stores bookings (auto-created)
```

## ▶ How to Run

1. **Compile the code**:
   ```bash
   javac *.java
   ```

2. **Run the application**:
   ```bash
   java HotelReservationSystem
   ```

## 🧪 Sample Output

```
--- Hotel Reservation System ---
1. View Available Rooms
2. Book a Room
3. Cancel Booking
4. View All Bookings
5. Exit
Choose an option: 1
```

## ✅ Room Categories

- `STANDARD` – Room numbers 1 to 5
- `DELUXE` – Room numbers 6 to 8
- `SUITE` – Room numbers 9 to 10

## 📂 Bookings File (`bookings.txt`)

Each successful booking is saved in a simple text file:
```
Deepthi booked Room #1 (STANDARD)
```

## 🚀 Future Enhancements

- Integrate with GUI (e.g., Java Swing)
- Replace file storage with MySQL using JDBC
- Add date-based room availability
- Add login & user account system

## 👩‍💻 Developed By

- **Your Name** (Replace with your actual name)
