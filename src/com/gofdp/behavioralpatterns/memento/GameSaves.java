package com.gofdp.behavioralpatterns.memento;

import java.util.ArrayList;
import java.util.List;

public class GameSaves {

	public List<Game.GameMemento> saves;
	
	public final static GameSaves instance = new GameSaves();
	
	private GameSaves() {
		saves = new ArrayList<>();
	}
}
