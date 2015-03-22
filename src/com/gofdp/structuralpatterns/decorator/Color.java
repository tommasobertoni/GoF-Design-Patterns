package com.gofdp.structuralpatterns.decorator;

public class Color implements Cloneable {

private int _r, _g, _b;
	
	public Color(int r, int g, int b) {
		setR(r);
		setG(g);
		setB(b);
	}
	
	public int[] getRGB() {
		int[] rgbArray = {_r, _g, _b}; 
		return rgbArray;
	}
	
	public void setR(int r) {
		_r = Color.toValidRGBValue(r);
	}
	
	public void setG(int g) {
		_g = Color.toValidRGBValue(g);
	}
	
	public void setB(int b) {
		_b = Color.toValidRGBValue(b);
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (!(obj instanceof Color))
			return false;
		
		Color cp = (Color) obj;
		return cp._r == this._r &&
			   cp._g == this._g &&
			   cp._b == this._b;
	}
	
	@Override
	protected Color clone() throws CloneNotSupportedException {
		return (Color) super.clone();
	}
	
	@Override
	public String toString() {
		return String.format("(%d, %d, %d)", _r, _g, _b);
	}
	
	static int toValidRGBValue(int x) {
		if (x < 0) return 0;
		if (x > 255) return 255;
		return x;
	}
}
