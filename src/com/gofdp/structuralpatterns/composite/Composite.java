package com.gofdp.structuralpatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

	protected List<Component> components;
	
	public Composite(String name, int price) {
		super(name, price);
		components = new ArrayList<>();	
	}
	
	public void addComponent(Component component) {
		components.add(component);
	}
	
	public void removeComponent(Component component) {
		components.remove(component);
	}
	
	public Component getComponent(int componentIndex) {
		
		try {
			return components.get(componentIndex);
		} catch (IndexOutOfBoundsException iOOBEx) {
			return null;
		}
	}
	
	@Override
	public int getPrice() {
		int price = super.getPrice();
		
		for (Component c : components)
			price += c.getPrice();
		
		return price;
	}
	
	@Override
	public String toString() {
		String toString = getName();
		
		for (Component c : components)
			toString += ", " + c;
		
		return toString;
	}
}
