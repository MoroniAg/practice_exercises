package com.cumorahcenter.month_02.week_02;

import java.util.Collections;
import java.util.stream.Collectors;

/**
 * Created by Gabriel Aguilera on 2/22/23
 */
public class Digitize {
	
	public static int[] digitize(long n) {
		var longStreams = String.valueOf(n)
								.chars()
								.mapToObj(Character::getNumericValue)
								.collect(Collectors.toList());
		Collections.reverse(longStreams);
		return longStreams.stream().mapToInt(integer -> (int) integer).toArray();
		
	}
	
}
