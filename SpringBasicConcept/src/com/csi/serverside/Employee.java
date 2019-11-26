package com.csi.serverside;

public class Employee {
	private int id;

private String empName;

public String getEmpName() {
	return empName;
}

public void setEmpName(String empName) {
	this.empName = empName;
}

public void init()
{
	System.out.println("Init Started");
}


public void destroy()
{
	System.out.println("Bean Destroyed");
}

	
}
