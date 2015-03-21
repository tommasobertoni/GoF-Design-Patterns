package com.gofdp.creationalpatterns.prototype;

public class ColorPrototype implements Cloneable {

	private int _r, _g, _b;
	
	public ColorPrototype(int r, int g, int b) {
		_r = ColorPrototype.toValidRGBValue(r);
		_g = ColorPrototype.toValidRGBValue(g);
		_b = ColorPrototype.toValidRGBValue(b);
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (!(obj instanceof ColorPrototype))
			return false;
		
		ColorPrototype cp = (ColorPrototype) obj;
		return cp._r == this._r &&
			   cp._g == this._g &&
			   cp._b == this._b;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
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
