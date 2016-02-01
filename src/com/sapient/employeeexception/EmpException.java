package com.sapient.employeeexception;

public class EmpException extends Exception{
	private double salary;
	
	public EmpException(double salary) {
		super();
		this.salary = salary;
	}

	public String getMessage(){
		if(salary==8500.00)
			return "salary for unskilled employees can not be less than 8500";
		if(salary==10500.00)
			return "salary for skilled employees can not be less than 10500";
		if(salary==9500.00)
			return "salary for semiskilled employees can not be less than 9500";
		return "";
	}
}
