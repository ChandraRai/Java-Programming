package com.ex.assignment2;

class Trapezoid extends Quadrilateral {
	
	int SideA;
	int SideB;
	int Height;	
	
	Trapezoid (int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
		super (x1, y1, x2, y2, x3, y3, x4, y4);	
		
		SideA = SideA();
		SideB = SideB();
		Height = Height();
	}	
		
	int calculateArea() {		
		return (((SideA + SideB)/ 2) * Height);
	}
	
	public String toString() {		
		return String.format("The Area of Trapezoid is: " + calculateArea());
	}
}
