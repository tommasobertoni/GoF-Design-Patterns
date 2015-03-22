package com.gofdp.structuralpatterns.decorator;

import com.gofdp.structuralpatterns.decorator.colorfilters.*;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Color initialColor = new Color(180, 120, 50);
		System.out.println("initial color: " + initialColor);
		
		Color color = initialColor.clone(); //also prototype
		
		BaseFilter filter = new BaseFilter(null);
		filter.filterColor(color); //(180, 120, 50)
		System.out.println("initial -> base filter: " + color);
		
		filter.setFilter(new Negative(null));
		filter.filterColor(color); //(75, 135, 205)
		System.out.println("initial -> negative: " + color);
		
		filter.setFilter(new Reddish(new Negative(null)));
		filter.filterColor(color); //(205, 110, 40)
		System.out.println("initial -> negative -> reddish: " + color);
		
		color = initialColor.clone(); //(180, 120, 50)
		Component reddishX2 = new Reddish(new Reddish(null)); 
		reddishX2.filterColor(color); //(230, 100, 30)
		System.out.println("initial -> reddish -> reddish: " + color);
		
		color = initialColor.clone(); //(180, 120, 50)
		filter.setFilter(new Bluish(reddishX2));
		filter.filterColor(color); //(220, 90, 55)
		System.out.println("initial -> reddish -> reddish -> bluish: " + color);
		
		color = initialColor.clone(); //(180, 120, 50)
		filter.setFilter(new Greenish(filter.getFilter()));
		filter.filterColor(color); //(210, 115, 45)
		System.out.println("initial -> reddish -> reddish -> bluish -> greenish: " + color);
		
		filter.setFilter(new Negative(null));
		filter.filterColor(color); //(45, 140, 210)
		System.out.println("initial -> reddish -> reddish -> bluish -> greenish -> negative: " + color);
	}
}
