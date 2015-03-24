package com.gofdp.structuralpatterns.facade;

public class Main {
	
	public static void main(String[] args) {
		
		ShapesDrawer sd = new ShapesDrawer();
		
		System.out.println("Draw circle:");
		sd.drawCircle(11, 5, 5.5);
		
		System.out.println("\nDraw rectangle:");
		sd.drawRectangle(3, 5, 9, 10);
		
		System.out.println("\nDraw triangle:");
		sd.drawTriangle(8, 5.8, 6);
	}
}
