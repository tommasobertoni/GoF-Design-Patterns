package com.gofdp.behavioralpatterns.command.movements;

import com.gofdp.behavioralpatterns.command.Maze;
import com.gofdp.behavioralpatterns.command.Point;

public class Left implements IMove {

	@Override
	public void move(Maze maze) throws ImpossibleMoveException {
		Point pp = maze.getPlayerPosition();
		
		Point left = new Point(pp.getX() - 1, pp.getY());
		if (maze.isThereAWall(left))
			throw new ImpossibleMoveException();
		
		maze.moveTo(left);
	}

	@Override
	public IMove opposite() {
		return new Right();
	}
	
	@Override
	public String toString() {
		return "left";
	}
}
