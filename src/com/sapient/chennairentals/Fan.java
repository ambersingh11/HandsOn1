package com.sapient.chennairentals;

public class Fan extends Item{
	
	private double price;
	private String type;
	
	public Fan(int serialNo, double price, String type,double rate) {
		super(serialNo,rate);
		this.price = price;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Fan [price=" + price + ", type=" + type + ", serialNo=" + serialNo + "]";
	}
	public double getRent(){
		return qty*days*rate;
	}
	public void setDays(int days){
		this.days=days;
	}
	public void setQty(int qty ){
		this.qty=qty;
	}
}
