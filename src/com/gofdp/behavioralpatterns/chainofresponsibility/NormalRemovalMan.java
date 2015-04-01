package com.gofdp.behavioralpatterns.chainofresponsibility;

public class NormalRemovalMan extends RemovalMan {

	public NormalRemovalMan(String name) {
		super(name);
	}

	@Override
	public boolean moveFurniture(Furniture furniture) {
		
		System.out.println("(" + toString() + ") I'm going to try to move this furniture");
		if (furniture.getWeight() < 75) return true;
		
		System.out.println("(" + toString() + ") Damn, that's heavy..");
		if (buddy == null) {
			System.out.println("and I don't know anybody able to move this!");
			return false;
		}
		
		else return buddy.moveFurniture(furniture);
	}
}
