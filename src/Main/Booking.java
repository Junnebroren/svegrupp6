package Main;

import java.time.LocalDate;

public class Booking {
    private String roomNr;
    private String customerSsn;
    private int bookingId;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private double totalPrice = 1000;

    public Booking(String roomNr, String customerSsn, int bookingId, LocalDate checkInDate, LocalDate checkOutDate, double totalPrice) {
        this.roomNr = roomNr;
        this.customerSsn = customerSsn;
        this.bookingId = bookingId;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.totalPrice = totalPrice;
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

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public LocalDate getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(LocalDate checkInDate) {
        this.checkInDate = checkInDate;
    }

    public LocalDate getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(LocalDate checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "roomNr='" + roomNr + '\'' +
                ", customerSsn='" + customerSsn + '\'' +
                ", bookingId=" + bookingId +
                ", checkInDate=" + checkInDate +
                ", checkOutDate=" + checkOutDate +
                ", totalPrice=" + totalPrice +
                '}';
    }
}

