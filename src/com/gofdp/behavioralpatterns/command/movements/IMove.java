package com.gofdp.behavioralpatterns.command.movements;

import com.gofdp.behavioralpatterns.command.Maze;

public interface IMove {

	public void move(Maze maze) throws ImpossibleMoveException;
	
	public IMove opposite();
}
