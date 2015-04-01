package com.gofdp.behavioralpatterns.chainofresponsibility;

public class StrongRemovalMan extends RemovalMan {

	public StrongRemovalMan(String name) {
		super(name);
	}

	@Override
	public boolean moveFurniture(Furniture furniture) {
		
		System.out.println("(" + toString() + ") I'm going to try to move this furniture");
		if (furniture.getWeight() < 125) return true;
		
		System.out.println("(" + toString() + ") This furniture is a mountain!");
		if (buddy == null) {
			System.out.println("and I don't know anybody able to move this!");
			return false;
		}
		
		else return buddy.moveFurniture(furniture);
	}
}
