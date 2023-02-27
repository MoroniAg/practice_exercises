package com.cumorahcenter.month_02.week_01;

/**
 * Created by Gabriel Aguilera on 2/21/23
 */
public class DnaStrand {
	public static String makeComplement(String dna) {
		var result = new StringBuffer("");
		for (char c : dna.toCharArray()) {
			String dnaString = String.valueOf(c);
			if (dnaString.equalsIgnoreCase("A")) {
				result.append("T");
			} else if (dnaString.equalsIgnoreCase("T")) {
				result.append("A");
			} else if (dnaString.equalsIgnoreCase("C")) {
				result.append("G");
			} else if (dnaString.equalsIgnoreCase("G")) {
				result.append("C");
			}
		}
		return result.toString();
	}
}
