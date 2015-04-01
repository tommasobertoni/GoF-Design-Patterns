package com.gofdp.structuralpatterns.flyweight;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Car {
	
	private final static int MAX_HORSE_POWER = 1000;
	private final static int MIN_WEIGHT = 1000;
	private final static double MAX_AE = 100;

	private int _weight;
	private int _horsePower;
	private double _aerodynamicEfficiency;
	
	public Car(int weight, int horsePower, double aerodynamicEfficiency) {
		
		if (weight < 0 ||
			horsePower < 0)
			throw new IllegalArgumentException();
		
		_weight = _weight <= MIN_WEIGHT ? MIN_WEIGHT : _weight;
		_horsePower = horsePower <= MAX_HORSE_POWER ? horsePower : MAX_HORSE_POWER;
		if (aerodynamicEfficiency > MAX_AE) aerodynamicEfficiency = MAX_AE;
		else if (aerodynamicEfficiency < -1 * MAX_AE) aerodynamicEfficiency = -1 * MAX_AE;
		_aerodynamicEfficiency = aerodynamicEfficiency / 150;
	}
	
	public int getWeight() {
		return _weight;
	}
	
	public int getHP() {
		return _horsePower;
	}
	
	public double getAE() {
		return _aerodynamicEfficiency;
	}
	
	public double secondsToTravel(double meters) {
		double noEfficiencyTime = Math.cbrt(2 * meters * _weight / (_horsePower * 735.49875));
		return round(noEfficiencyTime * (2 - _aerodynamicEfficiency), 3);
	}
	
	public static double round(double value, int places) {
	    if (places < 0) throw new IllegalArgumentException();

	    BigDecimal bd = new BigDecimal(value);
	    bd = bd.setScale(places, RoundingMode.HALF_UP);
	    return bd.doubleValue();
	}
}
