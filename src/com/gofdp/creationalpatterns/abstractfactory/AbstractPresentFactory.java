package com.gofdp.creationalpatterns.abstractfactory;

public interface AbstractPresentFactory {

	Container createContainer();
	
	Candy createCandy();
}
