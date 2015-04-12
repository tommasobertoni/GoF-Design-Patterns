package com.gofdp.behavioralpatterns.memento;

public class Main {

	public static void main(String[] args) {
		
		Game game = new Game("John");
		Player player = game.getPlayer();
		
		System.out.println("Items available: " + game.getItems());
		System.out.println("Player name: " + player.getName());
		
		player.pickItem(Items.BACKPACK);
		System.out.println("Player items: " + player.getItems());
		
		game.saveGame();
		System.out.println("Game saved");
		
		game.setRoom(1);
		System.out.println("Room 1");
		
		System.out.println("Items available: " + game.getItems());
		player.pickItem(Items.TORCH);
		System.out.println("Player items: " + player.getItems());
		
		player.rename("Adam");
		System.out.println("New player name: " + player.getName());
		
		game.load(0);
		System.out.println("Save loaded");
		
		System.out.println("Items available: " + game.getItems());
		System.out.println("Player name: " + player.getName());
		System.out.println("Player items: " + player.getItems());
	}
}
