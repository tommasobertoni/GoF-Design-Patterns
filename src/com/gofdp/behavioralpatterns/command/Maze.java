package com.gofdp.behavioralpatterns.command;

import java.util.LinkedList;
import java.util.List;

public class Maze {
	
	private final int maxX, maxY;

	private List<Point> _walls;
	private Point _treasure;
	private Point _playerPosition;
	private TreasureHandler _tHandler;
	
	public Maze(TreasureHandler thandler) {
		
		maxX = 5;
		maxY = 5;
		
		_tHandler = thandler;
		_playerPosition = new Point(0, 0);
		_walls = new LinkedList<>();
		_treasure = initWallsAndTreasure(_walls, 0);
	}
	
	public void restart() {
		_playerPosition = new Point(0, 0);
	}
	
	public void moveTo(Point dest) {
		_playerPosition = dest;
		if (_playerPosition.equals(_treasure)) _tHandler.onTreasureFound();
	}
	
	public boolean isThereAWall(Point point) {
		
		return point.getX() < 0 ||
			   point.getX() > maxX ||
			   point.getY() < 0 ||
			   point.getY() > maxY ||
			   _walls.contains(point);
	}
	
	public Point getPlayerPosition() {
		return _playerPosition;
	}
	
	public int getMaxX() {
		return maxX;
	}
	
	public int getMaxY() {
		return maxY;
	}
	
	public void setTreasurehandler(TreasureHandler thandler) {
		_tHandler = thandler;
	}
	
	private static Point initWallsAndTreasure(List<Point> walls, int mode) {
		walls.add(new Point(4, 0));
		walls.add(new Point(0, 1));
		walls.add(new Point(1, 1));
		walls.add(new Point(3, 1));
		walls.add(new Point(3, 2));
		walls.add(new Point(4, 2));
		walls.add(new Point(0, 3));
		walls.add(new Point(3, 3));
		walls.add(new Point(2, 4));
		walls.add(new Point(3, 4));
		walls.add(new Point(5, 4));
		walls.add(new Point(0, 5));
		walls.add(new Point(5, 5));
		
		return new Point(4, 1);
	}
}

abstract class TreasureHandler { abstract void onTreasureFound(); }
