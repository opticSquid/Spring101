package com.autum_project;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {

    @Test
    public void Instantiate() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        try {
            Employee emp = (Employee) ctx.getBean("emp");
            assertNotNull(emp);
            assertEquals(emp.getId(), 1);
            assertEquals(emp.getName(), "Soumalya");
            System.out.println("Employee ID: " + emp.getId());
            System.out.println("Employee Name: " + emp.getName());
        } catch (Exception e) {
            fail("Instantiation failed");
        }
        ctx.close();
    }

}
