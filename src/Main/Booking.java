package Main;

public class Booking {
    private String roomNr;
    private String customerSsn;

    public Booking(String roomNr, String customerSsn, int bookingId, date checkInDate, date checkOutDate, double totalPrice) {
        this.roomNr = roomNr;
        this.customerSsn = customerSsn;
        this.bookingId = bookingId;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.totalPrice = totalPrice;
    }

    private int bookingId;
    private date checkInDate;
    private date checkOutDate;
    private double totalPrice;

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public date getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(date checkInDate) {
        this.checkInDate = checkInDate;
    }

    public date getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(date checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    private double totalPrice;


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

