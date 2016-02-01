package com.sapient.chennairentals;
import java.util.Scanner;
public class App {
	private static double finalAmount;
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		Item arr[]=new Item[4];
		arr[0]=new Fan(101,450.60,"Orinet",12.4);
		arr[1]=new AirConditioner(2250.60,"split",102,14.5);
		arr[2]=new Furniture(750.60,"dining set",103,10.8);
		String ch="y";
		System.out.println("Store Catalouge:\n>Fan\n>AC\n>furniture");
		do{
			System.out.println("enter the name of the items you want to rent");
			switch(in.next()){
				case "fan": {	System.out.println(arr[0]);	
							System.out.println("enter the no. of fans you need");
							arr[0].setQty(in.nextInt());
							System.out.println("for how many days you want to rent our fan?");
							arr[0].setDays(in.nextInt());
							System.out.println("the total rent on this item is "+arr[0].getRent());
							
							finalAmount+=arr[0].getRent();}
				break;
				case "ac":
				case "AC": {	System.out.println(arr[1]);
							System.out.println("enter the no. of AC you need");
							arr[1].setQty(in.nextInt());
							System.out.println("for how many days you want to rent our AC?");
							arr[1].setDays(in.nextInt());
							System.out.println("the total rent on this item is "+arr[1].getRent());
							finalAmount+=arr[1].getRent();}
				break;
				case "furniture":{	System.out.println(arr[2]);
							System.out.println("enter the no. of furnitures you need");
							arr[2].setQty(in.nextInt());
							System.out.println("for how many days you want to rent our furniture?");
							arr[2].setDays(in.nextInt());
							System.out.println("the total rent on this item is "+arr[2].getRent());
							finalAmount+=arr[2].getRent();}
				break;
				default: System.out.println("Invalid Choice");
			}
			System.out.println("Want to view more? (y/n)");
			ch=in.next();
		}while(ch.equals("y"));
		System.out.println("The final checkout amount is "+finalAmount);
		in.close();
	}
}
