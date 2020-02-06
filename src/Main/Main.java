package Main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);
    ArrayList<Booking> bookings = new ArrayList<Booking>();
    ArrayList<Customer> customers = new ArrayList<Customer>();
    ArrayList<Room> rooms = new ArrayList<Room>();
    static Main myApp2 = new Main();

    private void setUpData() {
        Room room1 = new Room(1, false, 200, false, 2);
        Room room2 = new Room(2, false, 400, false, 2);
        Room room3 = new Room(3, false, 600, false, 3);
        Room room4 = new Room(4, true, 800, false, 4);
        Room room5 = new Room(5, true, 1000, false, 6);
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);
        rooms.add(room4);
        rooms.add(room5);



   }
    public static void main(String[] args) {
        Main myApp = new Main();
        myApp.setUpData();
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
        System.out.println("Which booking would you like to edit/remove? ");
    }

    private void ViewBookingOptions() {
        Scanner input = new Scanner(System.in);
        System.out.println("1. New booking ");
        System.out.println("2. Edit booking ");
        System.out.println("3. View booking ");
        System.out.println("4. Remove booking");
        System.out.println("5. Exit");

        int choice2;
        choice2 = input.nextInt();
        if (choice2 == 1) {
            System.out.println("What room do you want to book? ");
            System.out.println(rooms);
            input.nextLine();
            int roomNr = input.nextInt();
            input.nextLine();
            if(rooms.get((roomNr)-1).isBooked()==true) {
                System.out.println("Room Already Booked");
            }
            else {

                System.out.println("Enter your social security number: ");
                String customerSsn = input.nextLine();
                System.out.println("Enter Booking ID: ");
                int bookingId = input.nextInt();
                System.out.println("Date of check-in: ");
                LocalDate checkInDate = LocalDate.parse(input.next());
                System.out.println("Date of check-out: ");
                LocalDate checkOutDate = LocalDate.parse(input.next());
                Booking booking = new Booking(roomNr, customerSsn, bookingId, checkInDate, checkOutDate, 0);

                if (roomNr==1 && rooms.get(0).isBooked() == false) {
                    booking.setTotalPrice(200);
                    rooms.get(0).setBooked(true);
                    System.out.println("Price:  " + booking.getTotalPrice() + "kr");
                } else if (roomNr==2 && rooms.get(1).isBooked() == false) {
                    booking.setTotalPrice(400);
                    rooms.get(1).setBooked(true);
                    System.out.println("Price:  " + booking.getTotalPrice() + "kr");
                } else if (roomNr==3 && rooms.get(2).isBooked() == false) {
                    booking.setTotalPrice(600);
                    rooms.get(2).setBooked(true);
                    System.out.println("Price:  " + booking.getTotalPrice() + "kr");
                } else if (roomNr==4 && rooms.get(3).isBooked() == false) {
                    booking.setTotalPrice(800);
                    rooms.get(3).setBooked(true);
                    System.out.println("Price:  " + booking.getTotalPrice() + "kr");
                } else if (roomNr==5 && rooms.get(4).isBooked() == false) {
                    booking.setTotalPrice(1000);
                    rooms.get(4).setBooked(true);
                    System.out.println("Price:  " + booking.getTotalPrice() + "kr");

                }

                bookings.add(booking);
            }

        } else if (choice2 == 2) {
            myApp2.GetBooking();



        } else if (choice2 == 3) {
            for (Booking booking : bookings) {
                System.out.println(booking);
            }

        } else if (choice2 == 4) {

            String remove = "";
            System.out.println("Enter your ssn");
            input.nextLine();
            String cssn = input.nextLine();
            for (Booking booking : bookings) {
                if (booking.getCustomerSsn().equals(cssn)) {
                    System.out.println(booking);
                    System.out.println("Do you want to remove this booking?");
                    remove = input.nextLine();
                    if (remove.equals("Yes")) {
                        bookings.remove(booking);
                        for (Room room:rooms){
                            if (room.getRoomNb()==booking.getRoomNr()){
                                room.setBooked(false);
                            }
                        }

                        break;

                    }


                }
            }


        } else if (choice2 == 5) {
            System.out.println("You have exited bookings");
        }
    }

    private void GetCustomer() {
        for (int i = 0; i < customers.size(); i++) {
            System.out.println(customers.get(i - 1));
        }
        System.out.println(customers);
        System.out.println("Which customer would you like to edit/remove? ");
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
            input.nextLine();
            System.out.println("Enter your social security number: ");
            String ssn = input.nextLine();
            System.out.println("Enter your name: ");
            String name = input.nextLine();
            System.out.println("Enter your address: ");
            String address = input.nextLine();
            System.out.println("Enter telephone number: ");
            String telephoneNumber = input.nextLine();
            Customer customer = new Customer(ssn, name, address, telephoneNumber);
            customers.add(customer);

        } else if (choice3 == 2) {
            myApp2.GetCustomer();

        } else if (choice3 == 3) {
            for (Customer customer : customers) {
                System.out.println(customer);
            }

        } else if (choice3 == 4) {
            myApp2.GetCustomer();

        } else if (choice3 == 5) {
            System.out.println("You have exited customers");
        }
    }

    private void addRoom () {
        System.out.println("Enter new room number: ");
        int newRoom = input.nextInt();
        System.out.println("Does the new room have a balcony? ");
        boolean answer = input.nextBoolean();
        System.out.println("What is the price per night? ");
        double price = input.nextDouble();
        System.out.println("Is the new room booked? ");
        boolean answerBooked = input.nextBoolean();
        System.out.println("How many number of beds does the new room have? ");
        int beds = input.nextInt();
        Room room = new Room(newRoom, answer, price, answerBooked, beds);
        for (int i = 0; i < rooms.size(); i++) {
            if(rooms.get(i).getRoomNb() == newRoom) {
                System.out.println("Room already exists");
                break;
            } else {
                rooms.add(room);
                break;
            }
        }
    }

    private void ViewRoomOptions () {
        Scanner input = new Scanner(System.in);
        System.out.println("1. Add room ");
        System.out.println("2. Edit room ");
        System.out.println("3. View available room ");
        System.out.println("4. View all room");
        System.out.println("5. Remove rooms");
        System.out.println("6. Exit");


        int choice4 = input.nextInt();
        if (choice4 == 1) {
            myApp2.addRoom();

        } else if (choice4 == 2) {
            System.out.println("Which room would you like to edit?");
            System.out.println(rooms);

        } else if (choice4 == 3) {
            System.out.println("View available rooms option");
            for (int i = 0; i < rooms.size(); i++) {

                if (rooms.get(i).isBooked() == false) {
                    System.out.println(rooms.get(i));
                }

            }


        } else if (choice4 == 4) {
            System.out.println("View rooms option");
            System.out.println(rooms);

        } else if (choice4 == 5) {
            System.out.println("Which room would you like to remove?");
            System.out.println(rooms);

        } else if (choice4 == 6) {
            System.out.println("You have exited rooms");
        }
    }









}



