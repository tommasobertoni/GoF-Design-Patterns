package com.gofdp.behavioralpatterns.interpreter;

public abstract class ExpressionToken implements Comparable<ExpressionToken> {

	private String _value;
	private boolean _isValid;

	public ExpressionToken(String value, boolean isValid) {
		_value = value;
		_isValid = isValid;
	}

	public String getValue() {
		return _value;
	}

	public boolean isValid() {
		return _isValid;
	}

	@Override
	public String toString() {
		return _value;
	}
	
	@Override
	public int compareTo(ExpressionToken et) {
		return _value.compareTo(et._value);
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (!(obj instanceof ExpressionToken))
			return false;
		
		ExpressionToken et = (ExpressionToken) obj;
		return et._value.equals(_value) && et._isValid == _isValid;
	}
}
