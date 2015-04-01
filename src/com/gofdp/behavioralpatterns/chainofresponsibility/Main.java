package com.gofdp.behavioralpatterns.chainofresponsibility;

public class Main {

	public static void main(String[] args) {
		
		RemovalMan kevin = new WeakRemovalMan("Kevin");
		RemovalMan sean = new NormalRemovalMan("Sean");
		RemovalMan bobby = new StrongRemovalMan("Bobby");
		
		kevin.setBuddy(sean);
		sean.setBuddy(bobby);
		
		Furniture[] furniture = {
			new Furniture(10),
			new Furniture(60),
			new Furniture(100),
			new Furniture(200),
		};
		
		for (Furniture f : furniture) {
			if (kevin.moveFurniture(f)) System.out.println("[Furniture moved]");
			else System.out.println("[The furniture is still in place]");
			System.out.println();
		}
	}
}
