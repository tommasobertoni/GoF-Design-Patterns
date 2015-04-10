package com.gofdp.behavioralpatterns.interpreter.operators;

import com.gofdp.behavioralpatterns.interpreter.ExpressionToken;
import com.gofdp.behavioralpatterns.interpreter.Variable;

public class AdditionEvaluator extends IOperatorEvaluator {

	@Override
	public String targetValue() {
		return "+";
	}

	@Override
	protected ExpressionToken safeEvaluate(ExpressionToken a, ExpressionToken b) {
		return new Variable(Integer.parseInt(a.getValue()) + Integer.parseInt(b.getValue()));
	}
}
