package Main;

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
                    myApp.addBooking();
                    break;
                case 2:
                    myApp.addCustomer();
                    break;
                case 3:
                    myApp.allRooms();
                    break;
                case 4:
                    myApp.allCustomers();
                    break;
            }
        } while (choice < 5);
    }

    private void menu() {
        System.out.println("1. Add Booking ");
        System.out.println("2. Add Customer ");
        System.out.println("3. Show all rooms ");
        System.out.println("4. Show all customers ");
        System.out.println("5. Exit");
    }
    private void addBooking(){
        System.out.println("This is the addBooking method");
    }
    private void addCustomer(){
        System.out.println("This is the addCustomer method");
    }
    private void allRooms() {
        System.out.println("This is the allRooms method");
    }
    private void allCustomers(){
        System.out.println("This is the allCostumers method");
    }
}
