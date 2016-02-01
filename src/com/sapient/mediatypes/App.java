package com.sapient.mediatypes;
import java.util.Scanner;
public class App {
	public static void main(String[] args){
		Media arr[]=new Media[3];
		
		Scanner in=new Scanner(System.in);
		arr[0]=new Books("Hamza",9800L,"the great gatsby",9,3);
		arr[1]=new DVD("the martian",9,3,2.5);
		arr[2]=new Periodicals("Autolooks",9,3,"cars",5);
		
		System.out.println("Enter the type of media to be viewed");
		int ch=in.nextInt();
		switch(ch){
			case 1:System.out.println(arr[0]);
					break;
			case 2:System.out.println(arr[1]);
					break;
			case 3:System.out.println(arr[2]);
					break;
			default: System.out.println("Invalid choice");
		}
		in.close();
	}
}
