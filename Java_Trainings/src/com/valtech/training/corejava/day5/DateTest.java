package com.valtech.training.corejava.day5;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateTest {
	/*
	 * HH -FOUR 
	 * mm - MINUTE 
	 * ss - SECONDS 
	 * SS - MilliSeconds 
	 * YY / YYYY - YEAR 
	 * MM / MMM MONTH 
	 * dd - DAY DD- DA
	 */
	DateFormat df = new SimpleDateFormat("dd-MMM-YYYY HH:mm:SS");

	@Test
	public void testDate() {
		Date date = new Date();
		System.out.println(date);
		System.out.println(df.format(date));
	}

	@Test
	public void testDateOldWay() {
		Date date = new Date(47, 7, 15);
		System.out.println(date);
		System.out.println(df.format(date));
	}

	@Test
	public void testDateWithCal() {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 1947);
		cal.set(Calendar.MONTH, Calendar.AUGUST);
		cal.set(Calendar.DATE, 15);
		Date date = cal.getTime();
		System.out.println(date);
		System.out.println(df.format(date));
	}

	@Test
	public void testDateFromString() throws Exception {
		DateFormat df = new SimpleDateFormat("dd-MM-YYYY");
		Date date = df.parse("15-08-1947");
		System.out.println(date);
	}

}
