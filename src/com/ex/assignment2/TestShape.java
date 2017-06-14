package com.ex.assignment2;

public class TestShape {

	public static void main(String[] args) {
		Trapezoid t1 = new Trapezoid(10, 10, 15, 25, 25, 25, 30, 10);		
		Parallelogram p1 = new Parallelogram(10, 5, 15, 20, 0, 0, 30, 5);		
		Rectangle r1 = new Rectangle(5, 10, 5, 25, 0, 0, 30, 10);
		Square s1 = new Square(10, 10, 0, 0, 0, 0, 20, 10);
		
		System.out.println(t1);		
		System.out.println(p1);
		System.out.println(r1);
		System.out.println(s1);
	}
}
