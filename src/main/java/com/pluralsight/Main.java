package com.pluralsight;

public class Main {

    static void main() {

        System.out.println();

        Room room404 = new Room("double", 2, 200.50, false, false);
        System.out.println("Room's availability: " + room404.isAvailable());


        Reservation catFamily = new Reservation(room404, 7, true);
        System.out.printf("%.2f", catFamily.getReservationTotal());
        System.out.println();


        Employee employee1 = new Employee(69, "Cool Guy", "Housekeeping", 24.00, 41.1);
        System.out.println(employee1.getName() + "'s overtime hours worked: " + String.format("%.1f",employee1.getOvertimeHours()));
    }
}