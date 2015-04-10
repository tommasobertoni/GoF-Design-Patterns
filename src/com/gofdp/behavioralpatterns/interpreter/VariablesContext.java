package com.gofdp.behavioralpatterns.interpreter;

import java.util.Map;

public class VariablesContext {

	Map<String, Integer> variablesValue;

	public VariablesContext(Map<String, Integer> variablesValue) {
		this.variablesValue = variablesValue;
	}
}
