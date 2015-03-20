package com.gofdp.creationalpatterns.builder;

public class PessimisticWeatherForecast extends WeatherForecast {

	@Override
	void veryComplicatedAlgorithm() {
		
		this.result = "" + (new java.util.Random().nextBoolean() ? "#@%!" : "OMGsh") +
					  " tomorrow, " + this.focusDate.toString() + ", will rain again..";	
	}
}
