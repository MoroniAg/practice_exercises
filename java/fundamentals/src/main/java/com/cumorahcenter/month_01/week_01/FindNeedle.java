package com.cumorahcenter.month_01.week_01;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by Gabriel Aguilera on 2/16/23
 */
public class FindNeedle {
	
	public static String findNeedle(Object[] haystack) {
		return "found the needle at position %d".formatted(  Arrays.asList(haystack).indexOf("needle"));
	}
	
	
}
