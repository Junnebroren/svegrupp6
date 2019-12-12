package Main;


public class Room {
    private int roomNb;

    public int getRoomNb() {
        return roomNb;
    }

    public void setRoomNb(int roomNb) {
        this.roomNb = roomNb;
    }

    public String getoccupied() {
        return occupied;
    }

    public void setoccupied(String occupied ) {
        this.occupied = occupied;
    }

    private String occupied;

    public Room(int roomNb, String occupied) {
        this.roomNb = roomNb;
        this.occupied = occupied;
    }
}





