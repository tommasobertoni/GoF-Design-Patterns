package com.gofdp.structuralpatterns.bridge;

public class Miner {

	private IMiningTool _miningTool;
	
	public void setMiningTool(IMiningTool miningTool) {
		_miningTool = miningTool;
	}
	
	public Gem workOn(Rock rock) throws NeedAMiningToolException {
		if (_miningTool == null) throw new NeedAMiningToolException();
		
		Gem gem = null;
		try {
			gem = _miningTool.mine(rock);
		} catch (ToolBrokeException tbe) {
			_miningTool = null;
		}
		
		return gem;
	}
}

@SuppressWarnings("serial")
class NeedAMiningToolException extends Exception {}
