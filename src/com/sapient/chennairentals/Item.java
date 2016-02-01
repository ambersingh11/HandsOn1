package com.sapient.chennairentals;

public abstract class Item {
	protected int serialNo;
	protected double rate;
	protected int days;
	protected int qty;

	public Item(int serialNo,double rate) {
		super();
		this.serialNo = serialNo;
		this.rate=rate;
	}
	public abstract double getRent();
	public abstract void setDays(int days);
	public abstract void setQty(int qty);
}
