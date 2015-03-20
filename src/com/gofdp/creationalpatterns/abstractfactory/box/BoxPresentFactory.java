package com.gofdp.creationalpatterns.abstractfactory.box;

import com.gofdp.creationalpatterns.abstractfactory.AbstractPresentFactory;
import com.gofdp.creationalpatterns.abstractfactory.Candy;
import com.gofdp.creationalpatterns.abstractfactory.Container;

public class BoxPresentFactory implements AbstractPresentFactory {

	@Override
	public Container createContainer() {
		return new BoxContainer();
	}

	@Override
	public Candy createCandy() {
		return new SquaredCandy();
	}
}
