package com.cumorahcenter.month_01.weel_03;

import java.util.Arrays;

/**
 * Created by Gabriel Aguilera on 2/24/23
 */
public class MinMax {
	
	public static int[] minMax(int[] arr) {
		return new int[]{Arrays.stream(arr).min().orElse(0) , Arrays.stream(arr).max().orElse(0)};
	}
	
}
