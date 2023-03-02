package com.cumorahcenter.month_02.week_04;

/**
 * Created by Gabriel Aguilera on 2/27/23
 */
public class Square {
	
	public static boolean isSquare(int n) {
		return n >= 0 ? n == 0 ? true : n % Math.sqrt(n) == 0 : false;
	}
	
}
