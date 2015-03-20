package com.gofdp.creationalpatterns.builder;

import java.util.Date;

public abstract class WeatherForecast {
	
	protected Date focusDate;
	protected String result;
	
	void setDate(Date date) {
		focusDate = date;
	}
	
	abstract void veryComplicatedAlgorithm();

	String getResult() {
		return result;
	}
}
