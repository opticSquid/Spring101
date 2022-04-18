package com.autum_project.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ListTest {
	private static ApplicationContext ctx;

	public static void main(String[] args) {
		ctx = new ClassPathXmlApplicationContext("com/autum_project/list/ListConfig.xml");
		Hospital hospital = (Hospital) ctx.getBean("hospital");
		System.out.println("hospital name: " + hospital.getName());
		System.out.println(hospital.getDepartments());
		System.out.println("Hospital Departments" + hospital.getDepartments().getClass());
	}
}
