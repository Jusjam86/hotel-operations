package com.pluralsight;

public class Room {
    private String roomType;
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;

    // constructor for room object
    public Room(String roomType, int numberOfBeds, double price, boolean isOccupied, boolean isDirty)
    {
        this.roomType = roomType;
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
    }

    // getters
    public String getRoomType() {
        return roomType;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    // derived getter
    public boolean isAvailable() {
        return !isOccupied && !isDirty;
    }
}
