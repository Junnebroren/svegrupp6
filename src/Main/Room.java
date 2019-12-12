package Main;


public class Room {
    private int roomNb;
    private boolean hasBalcony;
    private double pricePerNight;
    private boolean isBooked;
    private int numberOfBeds;

    public Room(int roomNb, boolean hasBalcony, double pricePerNight, boolean isBooked, int numberOfBeds) {
        this.roomNb = roomNb;
        this.hasBalcony = hasBalcony;
        this.pricePerNight = pricePerNight;
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

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
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
}





