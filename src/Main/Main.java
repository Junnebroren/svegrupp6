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

        System.out.println("1. Booking ");
        System.out.println("2. edit booking ");
        System.out.println("3. view booking ");
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

        } else (choice2.equals("4")) {
            System.out.println("exit");
        }
    }

    private void viewBooking () {

    }
    private void editBooking () {

    }
    private void removeBooking(){

    }
    private void Customer(){
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
    }
    private void viewCustomer () {

    }
    private void editCustomer () {

    }
    private void removeCustomer(){

    }
    private void Room() {

    }
    private void viewRoom () {

    }
    private void editRoom () {

    }
    private void removeRoom (){

    }

}
