package Main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    ArrayList<Booking> bookings = new ArrayList<Booking>();
    ArrayList<Customer> customers = new ArrayList<Customer>();
    static Main myApp2 = new Main();

    public static void main(String[] args) {
        Main myApp = new Main();
        int choice;

        do {
            myApp.menu();
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    myApp.ViewBookingOptions();
                    break;
                case 2:
                    myApp.ViewCustomerOptions();
                    break;
                case 3:
                    myApp.ViewRoomOptions();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);
    }

    private void menu() {
        System.out.println("1. Booking ");
        System.out.println("2. Customer ");
        System.out.println("3. Room ");
        System.out.println("4. Exit");
    }

    private void GetBooking() {
        for (int i = 0; i < bookings.size(); i++) {
            System.out.println(bookings.get(i - 1));
        }
        System.out.println(bookings);
        System.out.println("Which booking would you like to edit? ");
    }

    private void ViewBookingOptions() {
        System.out.println("1. New booking ");
        System.out.println("2. Edit booking ");
        System.out.println("3. View booking ");
        System.out.println("4. Remove booking");
        System.out.println("5. Exit");

        int choice2;
        choice2 = input.nextInt();
        if (choice2 == 1) {
            System.out.println("What room do you want to book? ");
            input.nextLine();
            String roomNr = input.nextLine();
            System.out.println("Enter your social security number: ");
            String customerSsn = input.nextLine();
            System.out.println("Enter Booking ID: ");
            int bookingId = input.nextInt();
            System.out.println("Date of check-in: ");
            LocalDate checkInDate = LocalDate.parse(input.next());
            System.out.println("Date of check-out: ");
            LocalDate checkOutDate = LocalDate.parse(input.next());
            Booking booking = new Booking(roomNr, customerSsn, bookingId, checkInDate, checkOutDate, 1000);
            System.out.println("Price:  " + booking.getTotalPrice() + "kr");
            bookings.add(booking);

        } else if (choice2 == 2) {
            myApp2.GetBooking();
            System.out.println("Edit Booking option");

        } else if (choice2 == 3) {
            System.out.println("View Booking option");
            for (Booking booking : bookings) {
                System.out.println(booking);
            }

        } else if (choice2 == 4) {
            System.out.println("Remove Booking option");

        } else if (choice2 == 5) {
            System.out.println("Exit option");
        }
    }

    private void GetCustomer() {
        for (int i = 0; i < customers.size(); i++) {
            System.out.println(customers.get(i - 1));
        }
    }

    private void ViewCustomerOptions() {
        System.out.println("1. New customer ");
        System.out.println("2. Edit customer ");
        System.out.println("3. View customer ");
        System.out.println("4. Remove customer");
        System.out.println("5. Exit");

        int choice3;
        choice3 = input.nextInt();
        if (choice3 == 1) {
            System.out.println("Enter your social security number: ");
            String ssn = input.nextLine();
            input.nextLine();
            System.out.println("Enter your name: ");
            String name = input.nextLine();
            System.out.println("Enter your address: ");
            String address = input.nextLine();
            System.out.println("Enter telephone number: ");
            String telephoneNumber = input.nextLine();
            Customer customer = new Customer(ssn, name, address, telephoneNumber);
            customers.add(customer);

        } else if (choice3 == 2) {
           // System.out.println(myApp2.GetCustomer());

        } else if (choice3 == 3) {
            System.out.println("View Customer option");
            for (Customer customer : customers) {
                System.out.println(customer);
            }

        } else if (choice3 == 4) {
            myApp2.GetCustomer();
            System.out.println("Remove Customer option");

        } else if (choice3 == 5) {
            System.out.println("Exit option");
        }
    }
        private void ViewRoomOptions () {
            System.out.println("1. Add room ");
            System.out.println("2. Edit room ");
            System.out.println("3. View room ");
            System.out.println("4. Remove room");
            System.out.println("5. Exit");

            int choice4;
            choice4 = input.nextInt();
            if (choice4 == 1) {
                System.out.println("Add room option");

            } else if (choice4 == 2) {
                System.out.println("Edit Room option");

            } else if (choice4 == 3) {
                System.out.println("View Room option");

                ArrayList<String> rooms =new ArrayList<>();
                rooms.add("Room 1");
                rooms.add("Room 2");
                rooms.add("Room 3");
                rooms.add("Room 4");
                rooms.add("Room 5");
                rooms.add("Room 6");
                rooms.add("Room 7");
                rooms.add("Room 8");
                rooms.add("Room 9");
                rooms.add("Room 10");
                System.out.println(rooms);

            } else if (choice4 == 4) {
                System.out.println("Remove Room option");

            } else if (choice4 == 5) {
                System.out.println("Exit option");

            }
        }
    }
    
