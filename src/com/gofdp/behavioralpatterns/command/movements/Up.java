package com.gofdp.behavioralpatterns.command.movements;

import com.gofdp.behavioralpatterns.command.Maze;
import com.gofdp.behavioralpatterns.command.Point;

public class Up implements IMove {

	@Override
	public void move(Maze maze) throws ImpossibleMoveException {
		Point pp = maze.getPlayerPosition();
		
		Point up = new Point(pp.getX(), pp.getY() - 1);
		if (maze.isThereAWall(up))
			throw new ImpossibleMoveException();
		
		maze.moveTo(up);
	}

	@Override
	public IMove opposite() {
		return new Down();
	}
	
	@Override
	public String toString() {
		return "up";
	}
}
