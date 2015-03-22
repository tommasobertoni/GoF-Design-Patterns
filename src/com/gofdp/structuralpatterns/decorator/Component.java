package com.gofdp.structuralpatterns.decorator;

public abstract class Component {
	
	protected Component filter;
	
	public Component(Component filter) {
		setFilter(filter);
	}
	
	public Component getFilter() {
		return filter;
	}
	
	public void setFilter(Component filter) {
		this.filter = filter;
	}

	public abstract void filterColor(Color color);
}
