package com.cumorahcenter.month_02.week_05;
//import java.util.HexFormat;

import java.util.HexFormat;

/**
 * Created by Gabriel Aguilera on 2/28/23
 */
public class RgbToHex {
	
	public static String rgb(int r , int g , int b) {
		return HexFormat.of()
						.formatHex(new byte[]{validateValue(r) , validateValue(g) , validateValue(b)})
						.toUpperCase();
		
	}
	
	private static byte validateValue(int value) {
		return (byte) (value < 0 ? 0 : Math.min(value , 255));
		
	}
	
}
