package com.gofdp.structuralpatterns.composite;

public abstract class Component {

	private String _name;
	protected int price;
	
	public Component(String name) {
		this(name, 0);
	}
	
	public Component(String name, int price) {
		_name = name;
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getName() {
		return _name;
	}
	
	@Override
	public String toString() {
		return _name;
	}
}
