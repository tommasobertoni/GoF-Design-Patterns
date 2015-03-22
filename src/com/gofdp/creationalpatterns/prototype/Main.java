package com.gofdp.creationalpatterns.prototype;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		ColorPrototype[] colors = new ColorPrototype[3];
		
		colors[0] = new ColorPrototype(255, 6, 128);
		colors[1] = new ColorPrototype(24, 255, 0);
		colors[2] = new ColorPrototype(4, 80, 255);
		
		System.out.println("First array:");
		for (ColorPrototype cp : colors) {
			System.out.println("\t" + cp);
		}
		
		System.out.println("\nCloning first array\n");
		ColorPrototype[] clonedColors = new ColorPrototype[colors.length];
		for (int i = 0; i < clonedColors.length; i++)
			clonedColors[i] = colors[i].clone();
		
		System.out.println("Cloned array:");
		for (ColorPrototype cp : clonedColors) {
			System.out.println("\t" + cp);
		}
		
		//enable -ea
		for (int i = 0; i < clonedColors.length; i++) {
			assert clonedColors[i].equals(colors[i]); //same properties
			assert clonedColors[i] != colors[i]; //not same objects!
		}
	}
}
