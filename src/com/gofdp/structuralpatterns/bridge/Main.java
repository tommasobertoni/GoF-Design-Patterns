package com.gofdp.structuralpatterns.bridge;

public class Main {

	public static void main(String[] args) {
		
		Rock rock = new Rock(7000, new Gem(10000));
		
		Miner miner = new Miner();
		Gem extractedGem = null;
		do {
			try {
				extractedGem = miner.workOn(rock);
			} catch (NeedAMiningToolException namte) {
				System.out.println("Mining tool broke! Need a new one!");
				miner.setMiningTool(new Pickaxe());
			}
			
		} while (extractedGem == null);
		
		System.out.println("Yay! Extracted gem worth " + extractedGem.getValue() + " monopoly money!");
	}
}
