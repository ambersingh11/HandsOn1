package com.sapient.employeeexception;

public class App {

	public static void main(String[] args) {
		Employee e1=null;
		try{
			 e1=new Employee(8500,101,"xyz","unskilled");
			
		}catch(EmpException ex){
			System.out.println(ex.getMessage());
		}finally{
			if(e1==null)
				System.out.println("please render the required changes and construct the object again");
			else
				System.out.println("object created sucessfuly");
		}

	}

}
