package com.java.oops2;

public class Rectangle {

	private int length;
	private int breadth;

	public Rectangle(int length, int breadth) {
		// TODO Auto-generated constructor stub
		this.length = length;
		this.breadth = breadth;
	}
	
	public int areaOfTheRectangle() {
		return length*breadth;
	}

	public int perimeterOfTheRectangle() {
		// TODO Auto-generated method stub
		return 2*(length + breadth);
	}

}
