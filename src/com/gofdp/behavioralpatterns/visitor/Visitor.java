package com.gofdp.behavioralpatterns.visitor;

public interface Visitor<E extends Element> {

	public void visit(E element);
}
