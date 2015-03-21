package com.gofdp.creationalpatterns.singleton;

public class DatabaseConnection implements IDatabaseConnection {
	
	public final static DatabaseConnection instance = new DatabaseConnection();

	private DatabaseConnection() {
		System.out.println("[DatabaseConnection] Connecting...");
		System.out.println("[DatabaseConnection] Connection established");
	}
	
	@Override
	public void executeQuery(String query) {
		System.out.println("Query [" + query + "] executed successfully");
	}
}
