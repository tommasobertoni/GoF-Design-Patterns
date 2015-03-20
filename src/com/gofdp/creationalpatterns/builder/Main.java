package com.gofdp.creationalpatterns.builder;

public class Main {
	
	public static void main(String[] args) {
		
		NewscastDirector nd = new NewscastDirector();
		
		WeatherForecast newscast1 = new PessimisticWeatherForecast();
		nd.construct(newscast1);
		
		System.out.println(newscast1.getResult());
		
		NewscastDirector fnd = new FuturisticNewscastDirector();
		
		WeatherForecast newscast2 = new OptimisticWeatherForecast();
		fnd.construct(newscast2);
		
		System.out.println(newscast2.getResult());
	}
}
