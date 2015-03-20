package com.gofdp.creationalpatterns.abstractfactory.box;

import com.gofdp.creationalpatterns.abstractfactory.Candy;

public class SquaredCandy implements Candy {

	@Override
	public void watch() {
		System.out.println("A squared green candy");
	}
}
