package com.sapient.mediatypes;

public class Books extends Media{
	private String author;
	private long isbn;
	public Books(String author, long isbn,String title,int rating,int lendingLength) {
		super(title,rating,lendingLength);
		this.author = author;
		this.isbn = isbn;
	}
	@Override
	public String toString() {
		return "Books [author=" + author + ", isbn=" + isbn + ", title=" + title + ", rating=" + rating
				+ ", lendingLength=" + lendingLength + "]";
	}
	
}
