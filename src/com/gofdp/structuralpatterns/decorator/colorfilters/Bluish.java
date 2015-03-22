package com.gofdp.structuralpatterns.decorator.colorfilters;

import com.gofdp.structuralpatterns.decorator.Color;
import com.gofdp.structuralpatterns.decorator.Component;

public class Bluish extends Component {

	public Bluish(Component filter) {
		super(filter);
	}

	@Override
	public void filterColor(Color color) {
	
		if (filter != null) filter.filterColor(color);
		
		//bluish
		int[] rgb = color.getRGB();
		color.setR(rgb[0] - 10);
		color.setG(rgb[1] - 10);
		color.setB(rgb[2] + 25);
	}
}
