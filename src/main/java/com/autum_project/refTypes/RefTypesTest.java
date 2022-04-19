package com.autum_project.refTypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RefTypesTest {
	private static ApplicationContext ctx;

	public static void main(String[] args) {
		ctx = new ClassPathXmlApplicationContext("com/autum_project/refTypes/RefTypesConfig.xml");
		Scores score = (Scores) ctx.getBean("scores");
		System.out.println("Score:"+score.toString());
		Student student = (Student) ctx.getBean("student");
		System.out.println("Student: "+student.getScores());
	}
}
