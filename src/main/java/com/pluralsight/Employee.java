package com.pluralsight;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Employee {

    // constants
    private final double REGULAR_HOURS = 40;
    private final double OVERTIME_PAY = 1.5;

    // variables
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    // constructor
    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked){
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = 0;
    }

    // getters & setters
    public int getEmployeeId() {return employeeId;}

//    public void setEmployeeId(int employeeId) {this.employeeId = employeeId;}

    public String getName() {return name;}

//    public void setName(String name) {this.name = name;}

    public String getDepartment() {return department;}

//    public void setDepartment(String department) {this.department = department;}

    public double getPayRate() {return payRate;}

//    public void setPayRate(double payRate) {this.payRate = payRate;}

    public double getHoursWorked() {return Math.min(this.hoursWorked, 40);}

//    public void setHoursWorked(double hoursWorked) {this.hoursWorked = hoursWorked;}

    // derived getter
    public double getOvertimeHours() {return Math.max(this.hoursWorked - 40, 0);}

    public double getTotalPay(){return payRate * hoursWorked;}

    // method
    public void punchTimeCard(int punchIn, int punchOut)
    {
        LocalDateTime currentTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
        String timeStamp = currentTime.format(formatter);
        System.out.println("Punched Time: " + timeStamp);
        this.hoursWorked += punchOut - punchIn;
    }
}