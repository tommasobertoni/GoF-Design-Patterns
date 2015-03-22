package com.gofdp.structuralpatterns.composite.mobileparts;

import com.gofdp.structuralpatterns.composite.Composite;

public class Motherboard extends Composite {

	public Motherboard(String name) {
		super(name, 30);
		
		addComponent(new Cpu("aCpu"));
		addComponent(new Ram("aRam"));
		addComponent(new Storage("aStorage"));
		addComponent(new Gpu("aGpu"));
	}
}
