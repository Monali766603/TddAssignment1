package com.tdd.getCurrentDate;

import java.sql.Date;
import java.time.LocalDate;

public class GetCurrentDate {

	public LocalDate addDaysToCurrentDate(int days) {
		LocalDate currentDate = LocalDate.now();
		currentDate = currentDate.plusDays(4);
		return currentDate;

	}

}
