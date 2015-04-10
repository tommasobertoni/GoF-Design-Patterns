package com.gofdp.behavioralpatterns.interpreter.operators;

import com.gofdp.behavioralpatterns.interpreter.ExpressionToken;
import com.gofdp.behavioralpatterns.interpreter.Variable;

public abstract class IOperatorEvaluator {

	public abstract String targetValue();

	public ExpressionToken evaluate(ExpressionToken a, ExpressionToken operator, ExpressionToken b) {
		if (!a.isValid() || !b.isValid())
			return new Variable(a.getValue() + operator.getValue() + b.getValue());

		return safeEvaluate(a, b);
	}

	protected abstract ExpressionToken safeEvaluate(ExpressionToken a, ExpressionToken b);
}
