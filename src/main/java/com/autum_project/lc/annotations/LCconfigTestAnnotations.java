package com.autum_project.lc.annotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LCconfigTestAnnotations {
	private static AbstractApplicationContext ctx;

	public static void main(String[] args) {
		ctx = new ClassPathXmlApplicationContext("com/autum_project/lc/annotations/LCconfig.xml");
		Patient patient = (Patient) ctx.getBean("patient");
		System.out.println("Patient:" + patient);
		// We changed the ApplicationContext to its parent class
		// AbstractApplicationCOntext to aquire the additional property of Pre-Shutdown
		// hook
		// To enable the execution of destroy method of Patient bean
		// registerShutdownHook() runs the destroy method
		ctx.registerShutdownHook();
	}
}
