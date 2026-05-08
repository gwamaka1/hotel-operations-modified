package com.pluarlsight;

public class Reservation {
    private String roomType;
    private double price;
    private int numberOfNights;
    private boolean weekend;
    private double reservationTotal;

    public Reservation(String roomType, double reservationTotal, boolean weekend, int numberOfNights, double price) {
        this.roomType = roomType;
        this.reservationTotal = reservationTotal;
        this.weekend = weekend;
        this.numberOfNights = numberOfNights;
        if (roomType.equalsIgnoreCase("king")) {
            this.price = 139.00;
        }
        if (roomType.equalsIgnoreCase("double")){
            this.price = 124.00;
        }

    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;

    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public void setWeekend(boolean weekend) {
        this.weekend = weekend;
    }

    public String getRoomType() {
        return roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public double getPrice() {

        return price;
    }

    public boolean isWeekend(boolean isWeekend) {
        return weekend;
    }

    public double getReservationTotal() {
        double totalPay = price * numberOfNights;
        if(isWeekend(true)){
            totalPay*=1.1;
        }
        return totalPay;
    }
}

