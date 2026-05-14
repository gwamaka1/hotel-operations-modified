package com.pluarlsight;

public class Main {
    public static void main(String[] args) {
        Room room = new Room(2,100.00);
        room.checkIn();
        System.out.println("Room is occupied: " + room.isOccupied());
        System.out.println("Room is dirty: " + room.isDirty());

        // Guest checks out and room is cleaned
        room.checkOut();
        System.out.println("Room is occupied: " + room.isOccupied());
        room.cleanRoom();
        System.out.println("Room is dirty: " + room.isDirty());

        // Create a new employee and punch in
        Employee employee = new Employee(1, "John Doe", "Housekeeping", 15.00);
        employee.punchIn();

        // Employee works for 8.5 hours and punches out
        employee.punchOut();
        System.out.println("Hours worked: " + employee.getHourWorked());
        System.out.println("Total pay: " + employee.getTotalPay());
        System.out.println("Regular hours: " + employee.getRegularHours());
        System.out.println("Overtime hours: " + employee.getOvertimeHours());

        // Employee punches time card again
        employee.punchTimeCard(9);
        employee.punchTimeCard(18);
        System.out.println("Hours worked: " + employee.getHourWorked());
        System.out.println("Total pay: " + employee.getTotalPay());
        System.out.println("Regular hours: " + employee.getRegularHours());
        System.out.println("Overtime hours: " + employee.getOvertimeHours());
    }
}
