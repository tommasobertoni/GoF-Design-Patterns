package com.gofdp.creationalpatterns.singleton;

public class Main {

	public static void main(String[] args) {
		
		IDatabaseConnection dbc;
		
		//The constructor DatabaseConnection() is not visible
		//dbc = new DatabaseConnection();
		
		dbc = DatabaseConnection.instance; //now the object is initialized
		
		//The final field DatabaseConnection.instance cannot be assigned
		//DatabaseConnection.instance = DatabaseConnection.instance;
		
		dbc.executeQuery("SELECT * FROM MY_TABLE");
		
		procedure1();
		procedure2();
		
		IDatabaseConnection instance1 = DatabaseConnection.instance;
		IDatabaseConnection instance2 = DatabaseConnection.instance;
		
		//remember to enable assert!
		assert instance1 == instance2; //same object!
		
		//unsing enum-singleton
		IDatabaseConnection idbc = DatabaseConnectionEnum.INSTANCE; //now the enum is initialized
		idbc.executeQuery("SELECT * FROM BIG_TABLE");
		
		assert instance1 != idbc; //different classes, different singletons!
	}
	
	public static void procedure1() {
		DatabaseConnection.instance.executeQuery("INSERT INTO MY_TABLE VALUES('hey', 'singleton', 1)");
	}
	
	public static void procedure2() {
		DatabaseConnection.instance.executeQuery("DELETE * FROM MY_TABLE");
	}
}
