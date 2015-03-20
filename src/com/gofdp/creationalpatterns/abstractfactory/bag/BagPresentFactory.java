package com.gofdp.creationalpatterns.abstractfactory.bag;

import com.gofdp.creationalpatterns.abstractfactory.AbstractPresentFactory;
import com.gofdp.creationalpatterns.abstractfactory.Candy;
import com.gofdp.creationalpatterns.abstractfactory.Container;

public class BagPresentFactory implements AbstractPresentFactory {

	@Override
	public Container createContainer() {
		return new BagContainer();
	}

	@Override
	public Candy createCandy() {
		return new RoundedCandy();
	}
}
