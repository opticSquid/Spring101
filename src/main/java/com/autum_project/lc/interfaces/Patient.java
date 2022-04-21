package com.autum_project.lc.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean, DisposableBean {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Inside setter method");
		this.id = id;
	}

	/*There are 2 life cycle methods provided by spring to every bean
	 * One init() method and one destroy() method.
	 * init method runs at initialization of bean.
	 * destroy method runs when the bean is being destroyed
	 * the method of declaring init and destroy is similar the function names need
	 * not to be strictly init or destroy
	 * Their function signature should be same as defined by spring
	 * the signature would be "public void <function_name>(<no_parameters>)"
	 * the init and destroy functions can be assigned in the xml config method
	 * init() life cycle method function name can be anything
	 */
	public void hi() {
		System.out.println("Inside hi method");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

	public void bye() {
		System.out.println("Inside bye method");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Inside After Properties set");
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Inside destroy method");
	}
}
