package com.gofdp.behavioralpatterns.command;

import java.util.Scanner;

import com.gofdp.behavioralpatterns.command.movements.*;

public class Main {

	public static void main(String[] args) {
		
		TreasureHandler thandler = new TreasureHandler() {
			@Override
			void onTreasureFound() {
				System.out.println("You won! You found the hidden treasure!");
			}
		};
		
		Game game = new Game(thandler);
		System.out.println("Game started! Type u (up), d (down), l (left), r (right) and press ENTER to move!");
		System.out.println("You're in position: " + game.getPlayerPosition());
		
		/*
		 * SPOILER ALERT
		 * game solution: r r d d d l d d r r r u u r u u l
		 */
		Scanner sc = new Scanner(System.in);
		while (!game.isFinished()) {
			
			watch(game);
			String move = sc.nextLine().toLowerCase();
			
			try {
				switch (move) {
				case "u":
					game.move(new Up());
					break;
					
				case "d":
					game.move(new Down());
					break;
					
				case "l":
					game.move(new Left());
					break;
					
				case "r":
					game.move(new Right());
					break;
				}
				
			} catch (ImpossibleMoveException iMEx) {
				System.out.println("You can't move there!");
			}
		}
		
		sc.close();
		System.out.println("You're in position: " + game.getPlayerPosition());
		System.out.println("Go back!");
		try { game.reverseMovements();
		} catch (ImpossibleMoveException iMEx) {}
		System.out.println("Now you're in position: " + game.getPlayerPosition());
	}
	
	public static void watch(Game game) {
		String watch = "Available directions: ";
		for (String direction : game.watchAround())
			watch += direction + ", ";
		
		System.out.println(watch.substring(0, watch.length() - 2));
	}
}
