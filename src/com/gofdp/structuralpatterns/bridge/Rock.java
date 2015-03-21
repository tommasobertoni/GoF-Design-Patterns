package com.gofdp.structuralpatterns.bridge;

public class Rock {

	private Gem _gem;
	private int _life;
	
	public Rock(int life, Gem gem) {
		_life = life;
		_gem = gem; 
	}
	
	public Gem hit(int removedLife) {
		
		_life -= removedLife;
		
		if (_life <= 0) return _gem;
		else return null;
	}
}
