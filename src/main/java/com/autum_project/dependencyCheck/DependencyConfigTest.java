package com.autum_project.dependencyCheck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyConfigTest {
	private static ApplicationContext ctx;

	public static void main(String[] args) {
		ctx = new ClassPathXmlApplicationContext("com/autum_project/lc/annotations/LCconfig.xml");
		Prescription prescription = (Prescription) ctx.getBean("prescription");
		System.out.println("Prescription:" + prescription);
	}
}
