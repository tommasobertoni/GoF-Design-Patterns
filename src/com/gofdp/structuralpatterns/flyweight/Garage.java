package com.gofdp.structuralpatterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class Garage {
	
	private final static String CITY_CAR_NAME = "citycarname";
	private final static String BUSINESS_CAR_NAME = "businesscarname";
	private final static String SPORT_CAR_NAME = "sportcarname";

	private Map<String, Car> _cars;
	
	public Garage() {
		_cars = new HashMap<String, Car>();
	}
	
	public Car getCityCar() {
		Car cityCar = _cars.get(CITY_CAR_NAME);
		if (cityCar == null) { //lazy loading
			cityCar = buildCityCar();
			_cars.put(CITY_CAR_NAME, cityCar);
		}
		return cityCar;
	}
	
	public Car getBusinessCar() {
		Car businessCar = _cars.get(BUSINESS_CAR_NAME);
		if (businessCar == null) { //lazy loading
			businessCar = buildBusinessCar();
			_cars.put(BUSINESS_CAR_NAME, businessCar);
		}
		return businessCar;
	}
	
	public Car getSportCar() {
		Car sportCar = _cars.get(SPORT_CAR_NAME);
		if (sportCar == null) { //lazy loading
			sportCar = buildSportCar();
			_cars.put(SPORT_CAR_NAME, sportCar);
		}
		return sportCar;
	}
	
	private static Car buildCityCar() {
		return new Car(800, 70, -10);
	}
	
	private static Car buildBusinessCar() {
		return new Car(1200, 200, 12);
	}

	private static Car buildSportCar() {
		return new Car(1500, 600, 80);
	}
}
