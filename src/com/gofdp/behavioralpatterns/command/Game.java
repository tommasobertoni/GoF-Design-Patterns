package com.gofdp.behavioralpatterns.command;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import com.gofdp.behavioralpatterns.command.movements.IMove;
import com.gofdp.behavioralpatterns.command.movements.ImpossibleMoveException;

public class Game {

	private Maze _maze;
	private List<IMove> _movements;
	private boolean _isFinished;
	
	public Game(TreasureHandler thandler) {
		_maze = new Maze(new TreasureHandler() {
			@Override
			void onTreasureFound() {
				Game.this._isFinished = true;
				thandler.onTreasureFound();
			}
		});
		_movements = new LinkedList<>();
		_isFinished = false;
	}
	
	public void move(IMove movement) throws ImpossibleMoveException {
		movement.move(_maze);
		_movements.add(movement);
	}
	
	public Point getPlayerPosition() {
		return _maze.getPlayerPosition();
	}
	
	public List<String> watchAround() {
		List<String> directions = new LinkedList<>();
		
		Point pp = _maze.getPlayerPosition();
		
		Point up = new Point(pp.getX(), pp.getY() - 1);
		if (!_maze.isThereAWall(up)) directions.add("up");
		
		Point down = new Point(pp.getX(), pp.getY() + 1);
		if (!_maze.isThereAWall(down)) directions.add("down");
		
		Point left = new Point(pp.getX() - 1, pp.getY());
		if (!_maze.isThereAWall(left)) directions.add("left");
		
		Point right = new Point(pp.getX() + 1, pp.getY());
		if (!_maze.isThereAWall(right)) directions.add("right");
		
		return directions;
	}
	
	public boolean isFinished() {
		return _isFinished;
	}
	
	public void reverseMovements() throws ImpossibleMoveException {
		List<IMove> temp = new LinkedList<>(_movements);
		_movements.clear();
		Collections.reverse(temp);
		for (IMove move : temp)
			this.move(move.opposite());
	}
}
