package com.gofdp.creationalpatterns.singleton;

public enum DatabaseConnectionEnum implements IDatabaseConnection {

	INSTANCE;
	
	private DatabaseConnectionEnum() {
		System.out.println("[DatabaseConnectionEnum] Connecting...");
		System.out.println("[DatabaseConnectionEnum] Connection established");
	}

	@Override
	public void executeQuery(String query) {
		System.out.println("Query [" + query + "] executed successfully");
	}
}
