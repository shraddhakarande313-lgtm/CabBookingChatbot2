import java.util.Scanner;
import java.util.Random;

public class CabBookingChatbot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        while (true) {

            System.out.println("\n===== CAB BOOKING CHATBOT =====");
            System.out.println("1. Book Ride");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid input! Enter 1 or 2.");
                sc.next();
                continue;
            }

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    // Select Cab
                    System.out.println("\n===== SELECT CAB TYPE =====");
                    System.out.println("1. Auto - Rs.12/km");
                    System.out.println("2. Sedan - Rs.18/km");
                    System.out.println("3. SUV - Rs.25/km");
                    System.out.print("Enter cab choice: ");

                    if (!sc.hasNextInt()) {
                        System.out.println("Invalid cab choice!");
                        sc.next();
                        break;
                    }

                    int cabChoice = sc.nextInt();

                    String cabType;
                    int rate;

                    switch (cabChoice) {
                        case 1:
                            cabType = "Auto";
                            rate = 12;
                            break;

                        case 2:
                            cabType = "Sedan";
                            rate = 18;
                            break;

                        case 3:
                            cabType = "SUV";
                            rate = 25;
                            break;

                        default:
                            System.out.println("Invalid cab choice!");
                            continue;
                    }

                    // Select Route
                    System.out.println("\n===== SELECT ROUTE =====");
                    System.out.println(
                        "1. Pune Station to Shivajinagar - 5 km");
                    System.out.println(
                        "2. Swargate to Kothrud - 8 km");
                    System.out.println(
                        "3. Hinjawadi to Wakad - 10 km");

                    System.out.print("Enter route choice: ");

                    if (!sc.hasNextInt()) {
                        System.out.println("Invalid route choice!");
                        sc.next();
                        break;
                    }

                    int routeChoice = sc.nextInt();

                    String source;
                    String destination;
                    int distance;

                    switch (routeChoice) {
                        case 1:
                            source = "Pune Station";
                            destination = "Shivajinagar";
                            distance = 5;
                            break;

                        case 2:
                            source = "Swargate";
                            destination = "Kothrud";
                            distance = 8;
                            break;

                        case 3:
                            source = "Hinjawadi";
                            destination = "Wakad";
                            distance = 10;
                            break;

                        default:
                            System.out.println("Invalid route choice!");
                            continue;
                    }

                    // Calculate Fare
                    int fare = distance * rate;

                    System.out.println("\n===== BOOKING DETAILS =====");
                    System.out.println("Cab Type: " + cabType);
                    System.out.println("Source: " + source);
                    System.out.println("Destination: " + destination);
                    System.out.println("Distance: " + distance + " km");
                    System.out.println("Rate: Rs." + rate + "/km");
                    System.out.println("Total Fare: Rs." + fare);

                    // Confirmation
                    System.out.println("\n===== CONFIRM BOOKING =====");
                    System.out.println("1. Confirm & Share OTP");
                    System.out.println("2. Cancel Ride");
                    System.out.print("Enter your choice: ");

                    if (!sc.hasNextInt()) {
                        System.out.println("Invalid choice!");
                        sc.next();
                        break;
                    }

                    int confirmChoice = sc.nextInt();

                    if (confirmChoice == 2) {

                        System.out.println(
                            "Ride cancelled successfully.");
                        System.out.println(
                            "No OTP has been generated or shared.");

                    } else if (confirmChoice == 1) {

                        // Generate 4-digit OTP only after confirmation
                        int otp = 1000 + random.nextInt(9000);

                        System.out.println(
                            "\n===== BOOKING CONFIRMED =====");
                        System.out.println("Your OTP is: " + otp);
                        System.out.println("Cab Type: " + cabType);
                        System.out.println(
                            "Route: " + source + " to " + destination);
                        System.out.println("Total Fare: Rs." + fare);
                        System.out.println(
                            "OTP shared successfully.");
                        System.out.println("Your ride is now locked.");
                        System.out.println(
                            "Cancellation is NOT allowed after OTP sharing.");

                    } else {

                        System.out.println("Invalid confirmation choice!");
                        System.out.println("No OTP has been shared.");
                    }

                    break;

                case 2:

                    System.out.println(
                        "Thank you for using Cab Booking Chatbot!");
                    System.out.println("Goodbye!");

                    sc.close();
                    return;

                default:

                    System.out.println(
                        "Invalid menu choice! Please select 1 or 2.");
            }
        }
    }
}