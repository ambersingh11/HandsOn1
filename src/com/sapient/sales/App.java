package com.sapient.sales;
import java.util.Scanner;
public class App {
	public static void main(String[] args){
		Scanner in =new Scanner(System.in);
		TaxRate tr=new TaxRate();
		tr.setRate(3.6);
		TaxWhiz tx=new TaxWhiz(tr);
		System.out.println("Enter the purchase amount");
		double purchase=in.nextDouble();
		System.out.println("the sales tax amount for this purchase is "+ tx.calcTax(purchase) );
		in.close();
	}
}
