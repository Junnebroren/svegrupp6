package Main;

public class Room {
    private int roomNb;
    private boolean hasBalcony;
    private double price;
    private boolean isBooked;
    private int numberOfBeds;

    public Room(int roomNb, boolean hasBalcony, double price, boolean isBooked, int numberOfBeds) {
        this.roomNb = roomNb;
        this.hasBalcony = hasBalcony;
        this.price = price;
        this.isBooked = isBooked;
        this.numberOfBeds = numberOfBeds;
    }

    public int getRoomNb() {
        return roomNb;
    }

    public void setRoomNb(int roomNb) {
        this.roomNb = roomNb;
    }

    public boolean isHasBalcony() {
        return hasBalcony;
    }

    public void setHasBalcony(boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    @Override
    public String toString() {
        return "Room " + roomNb + "." +
                " Balcony = " + hasBalcony + "."
                + " Price/Night = " + price + "."
                + " Booked = " + isBooked + "."
                + " Number of beds = " + numberOfBeds + "\n";
    }
}