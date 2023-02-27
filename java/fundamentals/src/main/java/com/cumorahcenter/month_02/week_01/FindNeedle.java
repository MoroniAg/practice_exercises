package com.cumorahcenter.month_02.week_01;

import java.util.Arrays;

/**
 * Created by Gabriel Aguilera on 2/16/23
 */
public class FindNeedle {
	
	public static String findNeedle(Object[] haystack) {
		return "found the needle at position %d".formatted(  Arrays.asList(haystack).indexOf("needle"));
	}
	
	
}
