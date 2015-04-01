package com.gofdp.structuralpatterns.flyweight;

public class Main {

	public static void main(String[] args) {
		
		int[] routes = {300, 600, 900, 1000};
		Garage garage = new Garage();
		
		for (int routeLength : routes) {
			System.out.println("Route length: " + routeLength + " meters");
			System.out.println("City car takes " + garage.getCityCar().secondsToTravel(routeLength) + " seconds");
			System.out.println("Business car takes " + garage.getBusinessCar().secondsToTravel(routeLength) + " seconds");
			System.out.println("Sport car takes " + garage.getSportCar().secondsToTravel(routeLength) + " seconds");
			System.out.println();
		}
	}
}
