package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
	double length;
	double width;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public double area() {
		double area = length*width;
		return area;
	}
	
	public double perimeter() {
		double perimeter = (length*2)+(width*2);
		return perimeter;
	}
	
	public boolean isSmaller(double length1, double width1) {
		double area1 = length1*width1;
		if (area1 > this.area(length, width)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isSquare() {
		if (length == width) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Rectangle a = new Rectangle(15, 12);
		a.area();
		System.out.println(a.area());
	}
}











