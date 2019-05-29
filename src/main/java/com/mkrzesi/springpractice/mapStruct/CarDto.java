package com.mkrzesi.springpractice.mapStruct;

public class CarDto {

    private String nameMapped;
    private int seatsMapped;

    public String getNameMapped() {
        return nameMapped;
    }

    public void setNameMapped(String nameMapped) {
        this.nameMapped = nameMapped;
    }

    public int getSeatsMapped() {
        return seatsMapped;
    }

    public void setSeatsMapped(int seatsMapped) {
        this.seatsMapped = seatsMapped;
    }
}
