package com.cumorahcenter.month_02.week_05;

import java.util.StringTokenizer;

/**
 * Created by Gabriel Aguilera on 2/28/23
 */
public class PigLatin {
	
	private PigLatin() {
		throw new IllegalStateException("Utility class");
	}
	
	public static String pigIt(String str) {
		var result = new StringBuilder();
		var tokens = new StringTokenizer(str , " ");
		while (tokens.hasMoreTokens()) {
			var token = tokens.nextToken();
			result.append(newWorld(token));
		}
		return result.toString().trim();
	}
	
	private static String newWorld(String value) {
		var firstCharacter = String.valueOf(value.charAt(0));
		return firstCharacter.matches("[a-zA-Z]") ?
			   value.substring(1).concat(firstCharacter).concat("ay ") :
			   value;
	}
	
}
