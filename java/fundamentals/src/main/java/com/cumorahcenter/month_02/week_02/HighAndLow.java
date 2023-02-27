package com.cumorahcenter.month_02.week_02;

import java.util.Arrays;

/**
 * Created by Gabriel Aguilera on 2/22/23
 */
public class HighAndLow {
	
	public static String highAndLow(String numbers) {
		var intStream = Arrays.asList(numbers.split(" "))
							  .stream()
							  .mapToInt(Integer::valueOf)
							  .summaryStatistics();
		return "%d %d".formatted(intStream.getMax() , intStream.getMin());
	}
	
}
