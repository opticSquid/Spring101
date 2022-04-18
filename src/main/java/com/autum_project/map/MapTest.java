package com.autum_project.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MapTest {
	private static ApplicationContext ctx;

	public static void main(String[] args) {
		ctx = new ClassPathXmlApplicationContext("com/autum_project/map/MapConfig.xml");
		Customer customer = (Customer) ctx.getBean("customer");
		System.out.println("Total:"+customer.toString());
	}
}
