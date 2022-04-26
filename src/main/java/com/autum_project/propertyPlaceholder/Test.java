package com.autum_project.propertyPlaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	private static ApplicationContext ctx;

	public static void main(String[] args) {
		ctx = new ClassPathXmlApplicationContext("com/autum_project/propertyPlaceholder/PropertyPlaceholderConfig.xml");
		MyDAO dao = (MyDAO) ctx.getBean("myDAO");
		System.out.println(dao);
	}
}
