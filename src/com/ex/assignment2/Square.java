package com.ex.assignment2;

class Square extends Rectangle {	
	
	Square (int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
		super (x1, y1, x2, y2, x3, y3, x4, y4);
		
		Height = SideA();		
	}	
	
	@Override
	public String toString() {		
		return String.format("The Total Area of Square is: " + calculateArea());
	}
}