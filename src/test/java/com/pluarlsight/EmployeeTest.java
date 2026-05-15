package com.pluarlsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    @Test
    public void punchInandOut_EmployeeHoursInitialStatus_EmployeePunchedInandOut(){
        //Act
        Employee e = new Employee();
        //Arrange
        e.punchIn(2.00);
        e.punchOut(8.00);
        //Assert
        assertEquals(6.00,e.getHourWorked());
    }

}