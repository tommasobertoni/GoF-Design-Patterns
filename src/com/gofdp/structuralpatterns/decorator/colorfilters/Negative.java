package com.gofdp.structuralpatterns.decorator.colorfilters;

import com.gofdp.structuralpatterns.decorator.Color;
import com.gofdp.structuralpatterns.decorator.Component;

public class Negative extends Component {

	public Negative(Component filter) {
		super(filter);
	}

	@Override
	public void filterColor(Color color) {
	
		if (filter != null) filter.filterColor(color);
		
		//negative
		int[] rgb = color.getRGB();
		color.setR(255 - rgb[0]);
		color.setG(255 - rgb[1]);
		color.setB(255 - rgb[2]);
	}
}
