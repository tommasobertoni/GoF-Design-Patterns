package com.gofdp.structuralpatterns.facade.shapes;

import com.gofdp.structuralpatterns.facade.IShape;

public class Rectangle implements IShape {

	private Point _a, _d;
	
	public Rectangle(Point a, Point d) {
		
		if (a == null ||
			d == null)
			throw new NullPointerException();
		
		_a = a;
		_d = d;
	}

	@Override
	public void draw() {
		System.out.println(String.format("drawRect(%s, %s)", _a.toString(), _d.toString()));
	}
	
	@Override
	public String toString() {
		return String.format("A(%s) - D(%s)", _a.toString(), _d.toString());
	}
}
