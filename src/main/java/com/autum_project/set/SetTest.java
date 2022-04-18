package com.autum_project.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetTest {
	private static ApplicationContext ctx;

	public static void main(String[] args) {
		ctx = new ClassPathXmlApplicationContext("com/autum_project/set/SetConfig.xml");
		CarDealer dealer = (CarDealer) ctx.getBean("carDealer");
		System.out.println("Dealer name: " + dealer.getName());
		System.out.println(dealer.getModels());
		System.out.println("Hospital Departments" + dealer.getModels().getClass());
	}
}
