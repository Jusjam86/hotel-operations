package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    public void punchTimeCard_shouldAddToEmployee_hoursWorked() {
        // arrange
        Employee employee = new Employee(10, "Naomi", "Manager",42.10, 12);
        // act
        employee.punchTimeCard(8, 20); // follows military time, so write it in military time
        //assert
        assertEquals(12.0, employee.getHoursWorked(), "Employee's hours worked should be 40.0 after using punchTimeCard()");
    }

}