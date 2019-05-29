package com.mkrzesi.springpractice.mapStruct;

public class Car {

    private String name;
    private String type;
    private int seats;

    public Car(String name, String type, int seats) {
        this.name = name;
        this.type = type;
        this.seats = seats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}
