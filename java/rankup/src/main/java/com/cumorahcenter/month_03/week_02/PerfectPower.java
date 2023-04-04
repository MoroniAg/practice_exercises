package com.cumorahcenter.month_03.week_02;

import java.util.Arrays;

/**
 * Created by Gabriel Aguilera on 3/8/23
 */
public class PerfectPower {
	
	private PerfectPower(){
	
	}
	
	public static int[] isPerfectPower(int n) {
		var result = new int[2];
		for (int i = 2; i <= Math.sqrt(n); i++) {
			float  exponent = (float)Math.log(n) / (float) Math.log(i);
			if (formatNumber(exponent) - Math.round(exponent) == 0) {
				result[0] = i;
				result[1] =  Math.round(exponent);
				break;
			}
		}
		return Arrays.stream(result).max().getAsInt() == 0 ? null : result;
	}
	
	private static double formatNumber(double number) {
		var numberString = String.valueOf(number);
		if (numberString.length() >= 8) {
			return Double.parseDouble(numberString.substring(0 , 8));
		}
		return number;
	}
	
	
}
