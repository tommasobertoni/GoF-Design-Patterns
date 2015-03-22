package com.gofdp.structuralpatterns.composite;

import com.gofdp.structuralpatterns.composite.mobileparts.Camera;
import com.gofdp.structuralpatterns.composite.mobileparts.Case;
import com.gofdp.structuralpatterns.composite.mobileparts.Display;
import com.gofdp.structuralpatterns.composite.mobileparts.Motherboard;

public class Main {

	public static void main(String[] args) {
		
		Composite smartphone = new Composite("customSmartphone", 70); //this price indicates the "brand" value
		
		System.out.println(smartphone.getName() + ": " + smartphone.getPrice() + " monopoly money");
		System.out.println("components: " + smartphone);
		
		smartphone.addComponent(new Case("aCase"));
		smartphone.addComponent(new Motherboard("aMotherboard"));
		smartphone.addComponent(new Display("aDisplay"));
		smartphone.addComponent(new Camera("aCamera"));
		
		System.out.println("\n" + smartphone.getName() + ": " + smartphone.getPrice() + " monopoly money");
		System.out.println("components: " + smartphone);
		
		//remove the gpu
		//yeah, with those methods it's a bit tricky to add/remove component in the components tree
		Composite motherboard = (Composite) smartphone.getComponent(1);
		Component gpu = motherboard.getComponent(3);
		motherboard.removeComponent(gpu);
		
		System.out.println("\n" + smartphone.getName() + ": " + smartphone.getPrice() + " monopoly money");
		System.out.println("components: " + smartphone);
	}
}
