package busReserv;

import java.util.*;
import java.text.*;

public class booking {
    String passengerName;
    String from;
    String to;
    Date date;
    int busNo;
    static int bookingNum;
    private static int bookingCounter = 0; // A static counter to assign unique booking numbers

    public booking() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter passenger name:");
        passengerName = sc.next();
        System.out.println("Enter from:");
        from = sc.next();
        System.out.println("Enter to:");
        to = sc.next();
        System.out.println("Enter bus number:");
        busNo = sc.nextInt();
        System.out.println("Enter date (dd-MM-yyyy):");
        String dateFor = sc.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try {
            date = dateFormat.parse(dateFor);
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please use dd-MM-yyyy.");
            e.printStackTrace();
        }
        bookingNum = ++bookingCounter; // Assign a unique booking number
    }

    public boolean isAvailable(ArrayList<booking> bookings, ArrayList<bus> buses) {
        int capacity = 0;
        for (bus b : buses) {
            if (b.getBusNo() == busNo) {
                capacity = b.getcapacity();
                
            }
        }

        int booked = 0;
        for (booking b : bookings) {
            if (b.busNo == busNo && b.date.equals(date)) {
                booked++;
            }
        }

        return booked < capacity? true:false;
    }

	public static int getbookingCounter() {
		// TODO Auto-generated method stub
		return bookingNum ;
	}
	 public static boolean cancelBooking(ArrayList<booking> bookings, int bookingNum) {
	        for (booking booking : bookings) {
	            if (booking.bookingNum == bookingNum) {
	                bookings.remove(booking);
	                System.out.println("Booking canceled successfully.");
	                return true;
	            }
	        }
	        System.out.println("Booking number not found.");
	        
	        return false;
	 }
	 public static boolean userlogin() {
         Scanner sc = new Scanner(System.in);
         System.out.println("=== user Login ===");
         System.out.print("Enter username: ");
         String username = sc.nextLine();
         System.out.print("Enter password: ");
         String password = sc.nextLine();

         if (username.equals("user") && password.equals("user123")) {
             System.out.println("User login successful.");
             return true;
         } else {
             System.out.println("Invalid username or password. Access denied.");
             return false;
         }
     }

	public int getBusNo() {
		// TODO Auto-generated method stub
		return busNo;
	}

	public Date getDate() {
		// TODO Auto-generated method stub
		return date;
	}

	

}
