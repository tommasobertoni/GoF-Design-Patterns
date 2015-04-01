package com.gofdp.behavioralpatterns.chainofresponsibility;

public abstract class RemovalMan {
	
	private String _name;
	protected RemovalMan buddy;
	
	public RemovalMan(String name) {
		_name = name;
	}

	public abstract boolean moveFurniture(Furniture furniture);
	
	public void setBuddy(RemovalMan buddy) {
		this.buddy = buddy;
	}
	
	@Override
	public String toString() {
		return _name;
	}
}
