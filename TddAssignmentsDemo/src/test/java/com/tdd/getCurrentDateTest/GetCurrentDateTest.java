package com.tdd.getCurrentDateTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;

import org.junit.Test;

import com.tdd.getCurrentDate.GetCurrentDate;

public class GetCurrentDateTest {
	@Test
	public void shouldAddDaysInCurrentDateAndUpdateDate() {

		GetCurrentDate getCurrentDate = new GetCurrentDate();
		LocalDate actualDate = getCurrentDate.addDaysToCurrentDate(4);
		assertEquals(LocalDate.now().plusDays(4), actualDate);
	}

}
