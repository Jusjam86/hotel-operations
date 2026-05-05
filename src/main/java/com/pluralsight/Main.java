package com.pluralsight;

public class Main {

    static void main() {

        Employee CoolGuy = new Employee(86, "CoolGuy", "Manager", 32, 10);
        System.out.println(CoolGuy.getHoursWorked());

        // new shift
        CoolGuy.punchTimeCard(8, 16);
        System.out.println(CoolGuy.getHoursWorked());

    }
}