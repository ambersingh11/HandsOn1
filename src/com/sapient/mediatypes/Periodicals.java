package com.sapient.mediatypes;

public class Periodicals extends Media{
	private String subject;
	private int vol;
	public Periodicals(String title, int rating, int lendingLength, String subject, int vol) {
		super(title, rating, lendingLength);
		this.subject = subject;
		this.vol = vol;
	}
	@Override
	public String toString() {
		return "Periodicals [subject=" + subject + ", vol=" + vol + ", title=" + title + ", rating=" + rating
				+ ", lendingLength=" + lendingLength + "]";
	}
	
}
