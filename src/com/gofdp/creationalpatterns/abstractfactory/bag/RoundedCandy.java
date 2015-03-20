package com.gofdp.creationalpatterns.abstractfactory.bag;

import com.gofdp.creationalpatterns.abstractfactory.Candy;

public class RoundedCandy implements Candy {

	@Override
	public void watch() {
		System.out.println("A rounded red candy");
	}
}
