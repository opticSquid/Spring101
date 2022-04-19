package com.autum_project.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropertiesTest {
	private static ApplicationContext ctx;

	public static void main(String[] args) {
		ctx = new ClassPathXmlApplicationContext("com/autum_project/properties/PropertiesConfig.xml");
		CountriesAndLanguages country = (CountriesAndLanguages) ctx.getBean("countriesAndLangs");
		System.out.println("Total:"+country.toString());
	}
}
