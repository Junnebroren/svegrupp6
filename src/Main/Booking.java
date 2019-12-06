package Main;

public class Booking {
    private String roomNr;
    private String customerSsn;

    public Booking(String roomNr, String customerSsn) {
        this.roomNr = roomNr;
        this.customerSsn = customerSsn;
    }

    public String getRoomNr() {
        return roomNr;
    }

    public void setRoomNr(String roomNr) {
        this.roomNr = roomNr;
    }

    public String getCustomerSsn() {
        return customerSsn;
    }

    public void setCustomerSsn(String customerSsn) {
        this.customerSsn = customerSsn;
    }
}
