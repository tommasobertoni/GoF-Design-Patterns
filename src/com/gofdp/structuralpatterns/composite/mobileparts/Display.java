package com.gofdp.structuralpatterns.composite.mobileparts;

import com.gofdp.structuralpatterns.composite.Composite;

public class Display extends Composite {

	public Display(String name) {
		super(name, 10);
		
		addComponent(new Glass("aGlass"));
		addComponent(new DisplaySensors("someSensors"));
	}
}
