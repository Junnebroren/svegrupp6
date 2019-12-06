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
                    myApp.Booking();
                    break;
                case 2:
                    myApp.Customer();
                    break;
                case 3:
                    myApp.Rooms();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 4);
    }

    private void menu() {
        System.out.println("1. Add Booking ");
        System.out.println("2. Add Customer ");
        System.out.println("3. Show all rooms ");
        System.out.println("4. Exit");
    }
    private void Booking(){
        System.out.println("Enter your social security number: ");
        String ssn = input.nextLine();
        input.nextLine();
        System.out.println("What room do you want to book? ");
        String roomNr = input.nextLine();
        Booking booking = new Booking(ssn, roomNr);
    }
    private void Customer(){
        System.out.println("Enter your social security number: ");
        String ssn = input.nextLine();
        input.nextLine();
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        input.next();
        System.out.println("Enter your address: ");
        String address = input.nextLine();
        input.next();
        Customer customer = new Customer(ssn, age, name, address);
    }
    private void Rooms() {

    }
}
