package com.gofdp.structuralpatterns.bridge;

public class Pickaxe implements IMiningTool {
	
	private int _strength;
	private int _life;
	
	public Pickaxe() {
		_strength = 20;
		_life = 50;
	}

	@Override
	public Gem mine(Rock rock) throws ToolBrokeException {
		
		if (--_life <= 0) throw new ToolBrokeException();
		
		return rock.hit(_strength);
	}
}
