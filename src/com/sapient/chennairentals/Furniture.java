package com.sapient.chennairentals;

public class Furniture extends Item{
	private double price;
	private String type;
	public Furniture(double price, String type,int serialNo,double rate) {
		super(serialNo,rate);
		this.price = price;
		this.type = type;
	}
	@Override
	public String toString() {
		return "Furniture [price=" + price + ", type=" + type + ", serialNo=" + serialNo + "]";
	}
	public double getRent(){
		return qty*days*rate;
	}
	public void setDays(int days){
		this.days=days;
	}
	public void setQty(int qty){
		this.qty=qty;
	}
}
