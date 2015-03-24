package com.gofdp.structuralpatterns.facade.shapes;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import com.gofdp.structuralpatterns.facade.IShape;

public class Circle implements IShape {

	private Point _center;
	private double _radius;
	
	public Circle(Point center, double radius) {
		
		if (center == null) throw new NullPointerException();
		if (radius <= 0) throw new IllegalArgumentException();
		
		_center = center;
		_radius = radius;
	}

	@Override
	public void draw() {
		NumberFormat formatter = new DecimalFormat("#0.000");
		System.out.println(String.format("drawArc(%s, %s, 360)", _center.toString(), formatter.format(_radius)));
	}
	
	@Override
	public String toString() {
		NumberFormat formatter = new DecimalFormat("#0.000");
		return String.format("C(%s), r: ", _center.toString(), formatter.format(_radius));
	}
}
