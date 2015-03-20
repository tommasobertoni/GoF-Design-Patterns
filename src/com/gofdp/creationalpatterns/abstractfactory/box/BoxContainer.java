package com.gofdp.creationalpatterns.abstractfactory.box;

import com.gofdp.creationalpatterns.abstractfactory.Container;
import com.gofdp.creationalpatterns.abstractfactory.Present;

public class BoxContainer extends Container {
	
	@Override
	public void watch() {
		System.out.println("A box adorned with a bow");
		for (Present present : presents)
			present.watch();
	}
}
