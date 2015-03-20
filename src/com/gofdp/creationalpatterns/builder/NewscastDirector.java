package com.gofdp.creationalpatterns.builder;

import java.util.Calendar;
import java.util.Date;

public class NewscastDirector {

	void construct(WeatherForecast wf) {
		wf.setDate(getFocusDate());
		wf.veryComplicatedAlgorithm();
	}
	
	protected Date getFocusDate() {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, 1);
		Date tomorrow = new Date(cal.getTimeInMillis());
		
		return tomorrow;
	}
}
