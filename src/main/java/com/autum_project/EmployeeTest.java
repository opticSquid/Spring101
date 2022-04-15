package com.autum_project;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        try {
            Employee emp = (Employee) ctx.getBean("emp");
            System.out.println("Employee ID: " + emp.getId());
            System.out.println("Employee Name: " + emp.getName());
        } catch (Exception e) {
            System.out.println("Instantiation failed");
        }
        ctx.close();
    }

}
