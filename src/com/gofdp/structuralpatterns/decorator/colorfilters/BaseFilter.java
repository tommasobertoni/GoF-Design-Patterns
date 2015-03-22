package com.gofdp.structuralpatterns.decorator.colorfilters;

import com.gofdp.structuralpatterns.decorator.Color;
import com.gofdp.structuralpatterns.decorator.Component;

public class BaseFilter extends Component {

	public BaseFilter(Component filter) {
		super(filter);
	}

	@Override
	public void filterColor(Color color) {
		if (filter != null) filter.filterColor(color);
	}
}
