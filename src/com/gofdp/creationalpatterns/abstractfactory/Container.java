package com.gofdp.creationalpatterns.abstractfactory;

import java.util.ArrayList;
import java.util.List;

public abstract class Container implements Present {
	
	protected List<Present> presents;
	
	public Container() {
		presents = new ArrayList<>();
	}

	public void addPresent(Present present) {
		presents.add(present);
	}

	public void removePresent(Present present) {
		presents.remove(present);
	}

	public List<Present> getPresents() {
		return presents;
	}
}
