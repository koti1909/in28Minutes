package com.java.oops2;

public class Review {
	private int id;
	private String review;
	private int rating;

	public Review(int id, String review, int rating) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.review = review;
		this.rating = rating;
	}

	public String toString() {
		return String.format("[ID:%d; Review:%s; Rating:%d;]", id,review,rating);
	}
}
