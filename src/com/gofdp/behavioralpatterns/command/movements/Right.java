package com.gofdp.behavioralpatterns.command.movements;

import com.gofdp.behavioralpatterns.command.Maze;
import com.gofdp.behavioralpatterns.command.Point;

public class Right implements IMove {

	@Override
	public void move(Maze maze) throws ImpossibleMoveException {
		Point pp = maze.getPlayerPosition();
		
		Point right = new Point(pp.getX() + 1, pp.getY());
		if (maze.isThereAWall(right))
			throw new ImpossibleMoveException();
		
		maze.moveTo(right);
	}

	@Override
	public IMove opposite() {
		return new Left();
	}
	
	@Override
	public String toString() {
		return "right";
	}
}
