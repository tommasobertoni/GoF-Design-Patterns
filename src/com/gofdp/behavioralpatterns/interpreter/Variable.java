package com.gofdp.behavioralpatterns.interpreter;

public class Variable extends ExpressionToken {

	public Variable(String value) {
		super(value, false);
	}

	public Variable(int value) {
		super("" + value, true);
	}
}
