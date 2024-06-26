package com.java.oops2;

public class BookAndReviewRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book(123,"Object Composition - OOPS2", "Ranga");
		
		book.addReview(new Review(10, "good book", 4));
		
		book.addReview(new Review(11, "great book", 5));
		
		System.out.println(book);
	}

}
