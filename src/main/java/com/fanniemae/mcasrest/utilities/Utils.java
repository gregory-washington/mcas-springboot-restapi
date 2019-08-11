package com.fanniemae.mcasrest.utilities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {
	private static Utils ourInstance = new Utils();

	public static Utils getInstance() {
		return ourInstance;
	}

	private Utils() {}

	public static Date stringToDate(String str_date, String date_format) {
		Date date = null;
		try {

			date = new SimpleDateFormat(date_format).parse(str_date);
			System.out.println(str_date + "\t" + date);


		} catch (ParseException e) {
			System.out.println("Exception :" + e);
		}
		return  date;
	}
}
