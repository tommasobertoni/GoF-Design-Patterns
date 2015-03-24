package com.gofdp.structuralpatterns.facade;

import com.gofdp.structuralpatterns.facade.shapes.*;

public class ShapesDrawer {

	public void drawTriangle(double xIncenter, double yIncenter, double sideLength) {
		Triangle triangle = new Triangle(new Point(xIncenter, yIncenter), sideLength);
		triangle.draw();
	}
	
	public void drawRectangle(double x1, double y1, double x2, double y2) {
		Rectangle rectangle = new Rectangle(new Point(x1, y1), new Point(x2, y2));
		rectangle.draw();
	}
	
	public void drawCircle(double xCenter, double yCenter, double radius) {
		Circle circle = new Circle(new Point(xCenter, yCenter), radius);
		circle.draw();
	}
}
