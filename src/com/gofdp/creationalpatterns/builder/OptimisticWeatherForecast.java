package com.gofdp.creationalpatterns.builder;

public class OptimisticWeatherForecast extends WeatherForecast {

	@Override
	void veryComplicatedAlgorithm() {
		
		this.result = "" + (new java.util.Random().nextBoolean() ? "Yay!" : "Finally!") +
					  " Two days from today, " + this.focusDate.toString() + ", will be sunny!";
	}
}
