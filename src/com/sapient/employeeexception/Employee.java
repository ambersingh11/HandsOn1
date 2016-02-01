package com.sapient.employeeexception;

public class Employee {
	private double salary;
	private int eID;
	private String name;
	private String type;
	public Employee(double salary, int eID, String name, String type) throws EmpException {
		super();
		if(type.equals("unskilled")&&salary<8500.00)
			throw new EmpException(8500.00);
		else if(type.equals("skilled")&&salary<10500.00)
			throw new EmpException(10500.00);
		else if(type.equals("semiskilled")&&salary<9500.00)
			throw new EmpException(9500.00);
		else{
			this.salary = salary;
			this.eID = eID;
			this.name = name;
			this.type= type;
		}
	}
	
}
