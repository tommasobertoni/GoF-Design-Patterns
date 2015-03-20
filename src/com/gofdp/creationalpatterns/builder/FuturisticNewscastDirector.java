package com.gofdp.creationalpatterns.builder;

import java.util.Calendar;
import java.util.Date;

public class FuturisticNewscastDirector extends NewscastDirector {

	@Override
	protected Date getFocusDate() {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, 2);
		Date theDayAfterTomorrow = new Date(cal.getTimeInMillis());
		
		return theDayAfterTomorrow;
	}
}
