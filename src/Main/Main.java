package Main;

import java.util.Scanner;
import java.time.LocalDate;

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
                    System.out.println("Invalid choice");
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
        System.out.println("4. Exit");
        String choice2;
        choice2 = input.nextLine();
        if (choice2.equals("1")) {
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
            //  System.out.println("Price: " + totalPrice);
            Booking booking = new Booking(roomNr, customerSsn, bookingId, checkInDate, checkOutDate, 1000);
        } else if (choice2.equals("2")) {
            System.out.println("bla bla");

        } else if (choice2.equals("3")) {
            System.out.println("hej hej");
        } else if (choice2.equals("4")) {


        }

    }



    private void viewBooking() {

    }

    private void editBooking() {

    }

    private void removeBooking() {

    }

    private void Customer() {
        System.out.println("1. New customer ");
        System.out.println("2. Edit customer ");
        System.out.println("3. View customer ");
        System.out.println("4. Exit");
        String choice3;
        choice3 = input.nextLine();
        if (choice3.equals("1")) {
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

        } else if (choice3.equals("2")) {
            System.out.println("bla bla");

        } else if (choice3.equals("3")) {
            System.out.println("hej hej");
        } else if (choice3.equals("4")) {


        }

    }



    private void viewCustomer() {

    }

    private void editCustomer() {

    }

    private void removeCustomer() {

    }

    private void Room() {
        System.out.println("1. New room ");
        System.out.println("2. Edit room ");
        System.out.println("3. View room ");
        System.out.println("4. Exit");
        String choice4;
        choice4 = input.nextLine();
        if (choice4.equals("1")) {

        } else if (choice4.equals("2")) {
            System.out.println("bla bla");

        } else if (choice4.equals("3")) {
            System.out.println("hej hej");
        } else if (choice4.equals("4")) {


        }

    }





    private void viewRoom() {

    }

    private void editRoom() {

    }

    private void removeRoom() {

    }

}
