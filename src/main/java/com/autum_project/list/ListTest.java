package com.autum_project.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ListTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/autum_project/list/ListConfig.xml");
		Hospital hospital = (Hospital) ctx.getBean("hospital");
		System.out.println("hospital name: " + hospital.getName());
		System.out.println("Hospital Departments" + hospital.getDepartments());
	}
}
