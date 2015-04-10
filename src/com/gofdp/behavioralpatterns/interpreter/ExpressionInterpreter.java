package com.gofdp.behavioralpatterns.interpreter;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class ExpressionInterpreter {
	
	private String _expression;
	private List<ExpressionToken> _tokenizedExpression;
	private List<ExpressionToken> _interpretedExpression;

	public ExpressionInterpreter(String expression) {
		_expression = expression;
		tokenizeExpression();
		_interpretedExpression = new ArrayList<>();
	}
	
	private void tokenizeExpression() {
		String[] tokens = _expression.split("\\s+");
		_tokenizedExpression = new ArrayList<>();
		 
		 boolean shouldBeNumber = true;
		 for (String token : tokens) {
			 
			 if (shouldBeNumber) {
				 
				 try { _tokenizedExpression.add(new Variable(Integer.parseInt(token)));
				 } catch (NumberFormatException nFEx) { _tokenizedExpression.add(new Variable(token));}
				 
			 } else {
				 
				 boolean isValidOperator = false;
				 if (token.equals("+") ||
				     token.equals("-") ||
					 token.equals("*") ||
					 token.equals("/"))
					 isValidOperator = true;
				 
				 _tokenizedExpression.add(new Operator(token, isValidOperator));
			 }
			 
			 shouldBeNumber = !shouldBeNumber;
		 }
	}
	
	public void interpret(VariablesContext context) {
		
		if (context.variablesValue == null) return;
		
		_interpretedExpression.clear();
		TreeMap<String, Integer> variables = new TreeMap<>(context.variablesValue);
		
		boolean considerAsVariable = true;
		for (int i = 0; i < _tokenizedExpression.size(); i++, considerAsVariable = !considerAsVariable) {
			if (!considerAsVariable) {
				_interpretedExpression.add(_tokenizedExpression.get(i));
				continue;
			}
			
			Variable variable;
			Integer variableValue = variables.get(_tokenizedExpression.get(i).getValue());
			if (variableValue == null) variable = (Variable) _tokenizedExpression.get(i);
			else variable = new Variable(variableValue);
			_interpretedExpression.add(variable);
		}
	}
	
	public ExpressionToken getResult() {
		ExpressionEvaluator evaluator = new ExpressionEvaluator(_interpretedExpression);
		return evaluator.evaluate();
	}
	
	public String getExpression() {
		return _expression;
	}
	
	public boolean isInterpretedExpressionValid() {
		if (_interpretedExpression.size() == 0) return false;
		
		for (ExpressionToken et : _interpretedExpression)
			if (!et.isValid()) return false;
		
		return true;
	}
	
	@Override
	public String toString() {
		return _expression;
	}
}
