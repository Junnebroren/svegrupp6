package Main;
import java.io.IOException;
import java.util.Scanner;

public class Rooms {
        private static boolean MainMenu = true;
        private static boolean SubMenu = true;

        public static void main(String[] args) throws IOException {
            Scanner input = new Scanner(System.in);
            Room[] myHotel = new Room[10];
            myHotel[0] = new Room();
            myHotel[1] = new Room();
            myHotel[2] = new Room();
            myHotel[3] = new Room();
            myHotel[4] = new Room();
            myHotel[5] = new Room();
            myHotel[6] = new Room();
            myHotel[7] = new Room();
            myHotel[8] = new Room();
            myHotel[9] = new Room();
            int roomNum = 0;
            initialise(myHotel);
            while (MainMenu) {
                while (SubMenu) {
                    System.out.println("1: View all Rooms.");
                    String Selection = input.next();
                    Selection = Selection.toUpperCase();
                    switch (Selection) {
                        case "1":
                            ViewAllRooms(myHotel);
                            break;
                    }
                    System.out.println("------------------------------------------------------");
                    System.out.println("------------------------------------------------------");
                    System.out.println("Would you like to Choose another Option?\n1 ) Yes\n2 ) No");
                    System.out.println("------------------------------------------------------");
                    System.out.println("------------------------------------------------------");
                    if (input.nextInt() == 1) {
                        SubMenu = true;
                    } else {
                        SubMenu = false;
                    }
                }
                SubMenu = true;

            }
        }

        private static void CheckIfEmpty(Room[] myHotel) {
            for (int x = 0; x < myHotel.length; x++) {
                if (myHotel[x].getName().equals("nobody")) {
                    System.out.println("room " + (x + 1) + " is empty");
                }
            }
        }
        private static void initialise(Room[] myHotel) {
            for (int x = 0; x < myHotel.length; x++) {
                myHotel[x].setName("");
            }
        }
        private static void ViewAllRooms(Room[] myHotel) {
            for (int x = 0; x < myHotel.length; x++) {
                System.out.println("room " + (x + 1) + "  Is not occupied " + myHotel[x].getName());
            }
        }
        public static class Room {

            //protected String mainName;
            private String mainName;
            int guestsInRoom;

            public Room() {
                mainName = "k";
            }

            public void setName(String aName) {
                //  System.out.println("add name class method ");
                mainName = aName;
            }
            public String getName() {
                return mainName;
            }
        }
    }
