package com.autum_project.innerbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InnerbeanConfigTest {
	private static ApplicationContext ctx;

	public static void main(String[] args) {
		ctx = new ClassPathXmlApplicationContext("com/autum_project/innerbean/InnerbeanConfig.xml");
		Employee emploe = (Employee) ctx.getBean("employee");
		System.out.println("Employee:" + emploe);
	}
}
