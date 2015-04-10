package com.gofdp.behavioralpatterns.interpreter;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		//interpreter 1
		String expression = "a + b - c / d / e + b * b";
		ExpressionInterpreter interpreter = new ExpressionInterpreter(expression);
		
		//test1 -> ok
		Map<String, Integer> variableValues = new HashMap<>();
		variableValues.put("a", 3);
		variableValues.put("b", 2);
		variableValues.put("c", 10);
		variableValues.put("d", 2);
		variableValues.put("e", 5);
		
		interpreter.interpret(new VariablesContext(variableValues));
		System.out.println("Test 1");
		System.out.println(expression + "\t is valid? " + interpreter.isInterpretedExpressionValid()); //true
		System.out.println("Result: " + interpreter.getResult()); //8
		
		//test2 -> incomplete context
		variableValues.clear();
		variableValues.put("a", 3);
		variableValues.put("c", 10);
		variableValues.put("d", 2);
		variableValues.put("e", 5);
		
		interpreter.interpret(new VariablesContext(variableValues));
		System.out.println("\nTest 2");
		System.out.println(expression + "\t is valid? " + interpreter.isInterpretedExpressionValid()); //false
		System.out.println("Result: " + interpreter.getResult()); //3+b-1+b*b
		
		
		//interpreter 2
		String expression2 = "a a + b";
		ExpressionInterpreter interpreter2 = new ExpressionInterpreter(expression2);
		
		//test3, -> wrong format
		variableValues.clear();
		variableValues.put("a", 3);
		variableValues.put("b", 2);
		
		interpreter2.interpret(new VariablesContext(variableValues));
		System.out.println("\nTest 3");
		System.out.println(expression2 + "\t is valid? " + interpreter2.isInterpretedExpressionValid()); //false
		System.out.println("Result: " + interpreter2.getResult()); //null
	}
}
