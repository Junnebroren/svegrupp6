package Main;

public class Booking {
    private String roomNr, roomCustomer;

    public Booking(String roomNr, String roomCustomer) {
        this.roomNr = roomNr;
        this.roomCustomer = roomCustomer;
    }

    public String getRoomNr() {
        return roomNr;
    }

    public void setRoomNr(String roomNr) {
        this.roomNr = roomNr;
    }

    public String getRoomCustomer() {
        return roomCustomer;
    }

    public void setRoomCustomer(String roomCustomer) {
        this.roomCustomer = roomCustomer;
    }
}
