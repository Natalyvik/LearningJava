package com.company;

public class StaffManagement {
    //Fields
    private String nameOfStaff;
    private final int hourlyRate = 20;
    private int hoursWorked;

    //Methods
    public void printMessage () {
        System.out.println("Calculating pay");
    }
    public int calculatePay () {
        printMessage();
        int staffPay = hoursWorked * hourlyRate;
        return staffPay;
    }
    //Getter and Setters Methods
    public void setHoursWorked (int hours) {
        if (hours >= 0) {
            hoursWorked = hours;
        } else {
            System.out.println("Hours cannot be smaller than zero");
        }
    }
    public int getHoursWorked() {
        return hoursWorked;
    }
    //Constructor
    public StaffManagement (String name) {
        nameOfStaff = name;
        System.out.println("Created staff member " + nameOfStaff);

    }
}
