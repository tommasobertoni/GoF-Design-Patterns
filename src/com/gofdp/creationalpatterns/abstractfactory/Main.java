package com.gofdp.creationalpatterns.abstractfactory;

import com.gofdp.creationalpatterns.abstractfactory.bag.BagPresentFactory;
import com.gofdp.creationalpatterns.abstractfactory.box.BoxPresentFactory;

public class Main {

	public static void main(String[] args) {
		
		AbstractPresentFactory presentFactory;
		
		if (args.length > 0 && args[0].equals("bag"))
			presentFactory = new BagPresentFactory();
		else presentFactory = new BoxPresentFactory();
		
		Container mainContainer = presentFactory.createContainer();
		for (int i = 0; i < 2; i++)
			mainContainer.addPresent(presentFactory.createCandy());
		
		Container innerContainer = presentFactory.createContainer();
		for (int i = 0; i < 3; i++)
			innerContainer.addPresent(presentFactory.createCandy());
		
		mainContainer.addPresent(innerContainer);
		mainContainer.watch();
	}
}
