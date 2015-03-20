package com.gofdp.creationalpatterns.abstractfactory.bag;

import com.gofdp.creationalpatterns.abstractfactory.Container;
import com.gofdp.creationalpatterns.abstractfactory.Present;

public class BagContainer extends Container {
	
	@Override
	public void watch() {
		System.out.println("A purple bag with yellow strings");
		for (Present present : presents)
			present.watch();
	}
}
