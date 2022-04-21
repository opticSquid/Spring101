package com.autum_project.innerbean;

public class Employee {
	private int id;
	private Address adrs;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Address getAdrs() {
		return adrs;
	}

	public void setAdrs(Address adrs) {
		this.adrs = adrs;
	}

	@Override
	public String toString() {
		return "Employee [getId()=" + getId() + ", getAdrs()=" + getAdrs() + "]";
	}
	
}
