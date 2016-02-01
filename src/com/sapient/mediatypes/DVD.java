package com.sapient.mediatypes;

public class DVD extends Media{
	private double runningTime;

	@Override
	public String toString() {
		return "DVD [runningTime=" + runningTime + ", title=" + title + ", rating=" + rating + ", lendingLength="
				+ lendingLength + "]";
	}

	public DVD(String title, int rating, int lendingLength, double runningTime) {
		super(title, rating, lendingLength);
		this.runningTime = runningTime;
	}
	
}
