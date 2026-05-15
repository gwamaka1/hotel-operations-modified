
package com.pluarlsight;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hourWorked;
    private double startTime;


    public Employee(int employeeId, String name, String department, double payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hourWorked = hourWorked;
        this.startTime = 0.00;
    }
    public Employee(){
        this.startTime = 0.00;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHourWorked() {
        return hourWorked;
    }

    // Dervived getters
    public double getTotalPay() {
        return getHourWorked() * payRate + getOvertimeHours() * (payRate * 1.5);


    }

    public double getRegularHours() {
        if (hourWorked > 40) {
            return 40;
        } else {
            return hourWorked;
        }


    }

    public double getOvertimeHours() {
        if (hourWorked > 40) {
            return hourWorked - 40;
        } else {
            return 0;
        }

    }

    public void punchTimeCard(int time) {
        if (startTime == 0) {
            startTime = time;
        } else {
            double duration = time - startTime;
            hourWorked += duration;
            startTime = 0;

        }

    }
    public void punchIn(){
        LocalDateTime now = LocalDateTime.now();
        int hour = now.getHour();
        int min = now.getMinute();
        startTime = hour+ (min/60.00);
    }
    public void punchOut(){
        LocalDateTime now =LocalDateTime.now();
        int hour = now.getHour();
        int min = now.getMinute();
        double time = hour+(min/60.00);
        double duration = time - startTime;
        hourWorked+= duration;
        startTime = 0;

    }
    public void punchIn(double startTime){
        this.startTime = startTime;
    }
    public void punchOut(double time){
        double duration = time - this.startTime;
        hourWorked+= duration;
        this.startTime = 0;
    }

}


