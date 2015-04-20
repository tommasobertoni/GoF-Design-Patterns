package com.gofdp.behavioralpatterns.visitor;

public interface Element {

	@SuppressWarnings("rawtypes")
	public void accept(Visitor visitor);
}
