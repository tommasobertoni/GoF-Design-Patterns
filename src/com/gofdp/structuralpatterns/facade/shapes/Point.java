package com.gofdp.structuralpatterns.facade.shapes;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Point {

	private double _x, _y;
	
	public Point(double x, double y) {		
		_x = x;
		_y = y;
	}
	
	public double getX() {
		return _x;
	}
	
	public double getY() {
		return _y;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (!(obj instanceof Point))
			return false;
		
		Point point = (Point) obj;
		
		return point._x == _x &&
			   point._y == _y;
	}
	
	@Override
	public String toString() {
		NumberFormat formatter = new DecimalFormat("#0.000");
		return String.format("(%s, %s)", formatter.format(_x), formatter.format(_y));
	}
}
