package com.sapient.chennairentals;

public class AirConditioner extends Item{
	private double price;
	private String model;
	public AirConditioner(double price, String model,int serialNo,double rate) {
		super(serialNo,rate);
		this.price = price;
		this.model = model;
	}
	@Override
	public String toString() {
		return "AirConditioner [price=" + price + ", model=" + model + ", serialNo=" + serialNo + "]";
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
