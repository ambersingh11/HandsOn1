package com.sapient.mediatypes;

public abstract class Media {
	protected String title;
	protected int rating;
	protected int lendingLength;
	public Media(String title, int rating, int lendingLength) {
		super();
		this.title = title;
		this.rating = rating;
		this.lendingLength = lendingLength;
	}
	
}
