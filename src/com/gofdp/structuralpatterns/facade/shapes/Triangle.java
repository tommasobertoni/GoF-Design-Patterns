package com.gofdp.structuralpatterns.facade.shapes;

import com.gofdp.structuralpatterns.facade.IShape;

public class Triangle implements IShape {
	
	private Point _a, _b, _c;
	
	public Triangle(Point a, Point b, Point c) {
		
		if (a == null ||
			b == null ||
			c == null)
			throw new NullPointerException();
		
		_a = a;
		_b = b;
		_c = c;
	}
	
	public Triangle(Point incenter, double sideLength) {
		if (incenter == null) throw new NullPointerException();
		if (sideLength <= 0) throw new IllegalArgumentException();
		
		double ih = calcIR(sideLength);
		double h = calcH(sideLength);
		
		double halfSideLength = sideLength / 2;
		_a = new Point(incenter.getX() - halfSideLength, incenter.getY() - ih);
		_b = new Point(incenter.getX() + halfSideLength, incenter.getY() - ih);
		_c = new Point(incenter.getX(), incenter.getY() + h - ih);
	}

	@Override
	public void draw() {
		System.out.println(String.format("drawLine(%s, %s)", _a, _b));
		System.out.println(String.format("drawLine(%s, %s)", _b, _c));
		System.out.println(String.format("drawLine(%s, %s)", _c, _a));
	}
	
	@Override
	public String toString() {
		return String.format("A(%s) - B(%s) - C(%s)", _a.toString(), _b.toString(), _c.toString());
	}
	
	private static double calcIR(double sideLength) { //incenter's radius
		return sideLength / (2 * Math.sqrt(3));
	}
	
	private static double calcH(double sideLength) {
		return Math.sqrt(Math.pow(sideLength, 2) - Math.pow(sideLength / 2, 2));
	}
}
