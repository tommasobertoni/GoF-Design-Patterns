package com.gofdp.behavioralpatterns.command;

public class Point {

	private int _x, _y;
	
	public Point(int x, int y) {		
		_x = x;
		_y = y;
	}
	
	public int getX() {
		return _x;
	}
	
	public int getY() {
		return _y;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (!(obj instanceof Point))
			return false;
		
		Point point = (Point) obj;
		
		return point._x == _x &&
			   point._y == _y;
	}
	
	@Override
	public String toString() {
		return String.format("(%d, %d)", _x, _y);
	}
}
