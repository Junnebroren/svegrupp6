package Main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Main myApp = new Main();
        int choice;


        do {
            myApp.menu();
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    myApp.Booking();
                    break;
                case 2:
                    myApp.Customer();
                    break;
                case 3:
                    myApp.Room();
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

    private void Booking() {
        System.out.println("1. New booking ");
        System.out.println("2. Edit booking ");
        System.out.println("3. View booking ");
        System.out.println("4. Remove booking");
        System.out.println("5. Exit");

        int choice2;
        choice2 = input.nextInt();
        if (choice2 == 1) {
            System.out.println("What room do you want to book? ");
            String roomNr = input.nextLine();
            input.nextLine();
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
           ArrayList<Booking> bookings = new ArrayList<Booking>();
           bookings.add(booking);


        } else if (choice2 == 2) {
            System.out.println("bla bla");

        } else if (choice2 == 3) {
            System.out.println("hej hej");

        } else if (choice2 == 4) {


        } else if (choice2 == 5) {
            System.out.println("Exit");
        }
    }


    private void Customer() {
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
            input.next();
            System.out.println("Enter your address: ");
            String address = input.nextLine();
            input.next();
            System.out.println("Enter telephone number: ");
            String telephoneNumber = input.nextLine();
            input.nextLine();
            Customer customer = new Customer(ssn, name, address, telephoneNumber);
            ArrayList<Customer> customers = new ArrayList<Customer>();
            customers.add(customer);

        } else if (choice3 == 2) {
            System.out.println("bla bla");

        } else if (choice3 == 3) {
            System.out.println("hej hej");

        } else if (choice3 == 4) {


        } else if (choice3 == 5) {
            System.out.println("Exit");
        }
    }

        private void Room () {
            System.out.println("1. New room ");
            System.out.println("2. Edit room ");
            System.out.println("3. View room ");
            System.out.println("4. Remove room");
            System.out.println("5. Exit");

            int choice4;
            choice4 = input.nextInt();
            if (choice4 == 1) {

            } else if (choice4 == 2) {
                System.out.println("bla bla");

            } else if (choice4 == 2) {
                System.out.println("hej hej");

            } else if (choice4 == 1) {


            } else if (choice4 == 5) {
                System.out.println("Exit");
            }
        }
    }




