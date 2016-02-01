package com.sapient.sales;

public class TaxWhiz {
	private TaxRate tx;
	
	public TaxWhiz(TaxRate tx){
		super();
		this.tx=tx;
	}
	public double calcTax(double purchase){
		return tx.getRate()*purchase;
	}
}
