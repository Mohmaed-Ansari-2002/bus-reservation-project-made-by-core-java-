package busReserv;
import java.util.ArrayList;
import java.util.*;
import java.text.*;
public class busDemo {
    public static void main(String[] args) {
        ArrayList<bus> buses = new ArrayList<bus>();
        buses.add(new bus(1, true, "Karthik", "Chennai", "Tenkasi", 20, "2023-06-01"));
        buses.add(new bus(2, false, "Ravi", "Chennai", "Madurai", 30, "2023-06-02"));
        buses.add(new bus(3, true, "Anil", "Chennai", "Coimbatore", 25, "2023-06-03"));
        buses.add(new bus(4, false, "Suresh", "Chennai", "Salem", 35, "2023-06-04"));

        ArrayList<booking> bookings = new ArrayList<>();

        for (bus b : buses) {
            b.displayBusInfo();
        }

        Scanner sc = new Scanner(System.in);
        int userChoice = 0;
        while (userChoice != 5) {
            System.out.println("Enter 1 to book, 2 to cancel booking, 3 to admin,4 display ,5 exit");
            userChoice = sc.nextInt();
            switch (userChoice) {
                case 1:
                	if(booking.userlogin()) {
                    booking newBooking = new booking();
                    
                    if (newBooking.isAvailable(bookings, buses)) {
                        bookings.add(newBooking);
                        System.out.println("Booking confirmed.");
                    } else {
                        System.out.println("No available seats for this bus on the selected date.");
                    }
                    System.out.println("Current booking counter: " + booking.getbookingCounter());
                    break;}
                case 2:
                    System.out.println("Enter booking number to cancel:");
                    int bookingNum = sc.nextInt();
                    booking.cancelBooking(bookings, bookingNum);
                    break; 
                case 3:
                    if (loginAdmin()) {
                        addNewBus(buses);
                    } else {
                        System.out.println("Access denied. Only admins can add new buses.");
                    }
                    break;
                case 4:
                    displayAvailableSeats(buses, bookings);
                    break;
                case 5:
                    System.out.println("Exiting.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, 3, or 4.");
                    break;
            }}
    }
            public static boolean loginAdmin() {
                Scanner sc = new Scanner(System.in);
                System.out.println("=== Admin Login ===");
                System.out.print("Enter username: ");
                String username = sc.nextLine();
                System.out.print("Enter password: ");
                String password = sc.nextLine();

                if (username.equals("admin") && password.equals("admin123")) {
                    System.out.println("Admin login successful.");
                    return true;
                } else {
                    System.out.println("Invalid username or password. Access denied.");
                    return false;
                }
            }
    
            public static void addNewBus(ArrayList<bus> buses) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter bus number:");
                int busNo = sc.nextInt();
                System.out.println("Is it AC? (true/false):");
                boolean ac = sc.nextBoolean();
                System.out.println("Enter driver name:");
                String driverName = sc.next();
                System.out.println("Enter starting location:");
                String from = sc.next();
                System.out.println("Enter destination:");
                String to = sc.next();
                System.out.println("Enter capacity:");
                int capacity = sc.nextInt();
                System.out.println("Enter date in string format:");
                String date = sc.next();

                bus newBus = new bus(busNo, ac, driverName, from, to, capacity,date);
                buses.add(newBus);
                System.out.println("New bus added successfully.");
        }
            public static void displayAvailableSeats(ArrayList<bus> buses, ArrayList<booking> bookings) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter date (dd-MM-yyyy) to check availability:");
                String dateStr = sc.next();
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
                Date date = null;
                try {
                    date = dateFormat.parse(dateStr);
                } catch (ParseException e) {
                    e.printStackTrace();
                    return;
                }

                System.out.println("Available buses on " + dateStr + ":");
                for (bus bus : buses) {
                    try {
                        Date busDate = dateFormat.parse(bus.getDate());
                        if (busDate.equals(date)) {
                            int bookedSeats = 0;
                            for (booking booking : bookings) {
                                if (booking.getBusNo() == bus.getBusNo() && booking.getDate().equals(date)) {
                                    bookedSeats++;
                                }
                            }
                            int availableSeats = bus.getcapacity() - bookedSeats;
                            System.out.println("Bus No: " + bus.getBusNo() + ", Available Seats: " + availableSeats);
                        }
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                }
            }}


