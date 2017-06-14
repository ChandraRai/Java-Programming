package com.ex.assignment2;

abstract class Quadrilateral {
	
	Point c1, c2, c3, c4;
	
	Quadrilateral (int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
		c1 = new Point (x1, y1);
		c2 = new Point (x2, y2);
		c3 = new Point (x3, y3);
		c4 = new Point (x4, y4);
	}
	
	int SideA() {
		return Math.abs(c4.x - c1.x);
	}
	
	int SideB() {
		return Math.abs(c3.x - c2.x);
	}	
	
	int Height() {
		return Math.abs(c2.y - c1.y);
	}	
	
	abstract int calculateArea();	
}
