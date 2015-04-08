package com.gofdp.behavioralpatterns.command.movements;

import com.gofdp.behavioralpatterns.command.Maze;
import com.gofdp.behavioralpatterns.command.Point;

public class Down implements IMove {

	@Override
	public void move(Maze maze) throws ImpossibleMoveException {
		Point pp = maze.getPlayerPosition();
		
		Point down = new Point(pp.getX(), pp.getY() + 1);
		if (maze.isThereAWall(down))
			throw new ImpossibleMoveException();
		
		maze.moveTo(down);
	}

	@Override
	public IMove opposite() {
		return new Up();
	}
	
	@Override
	public String toString() {
		return "down";
	}
}
