package com.cumorahcenter.exercise_05;

import javax.swing.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

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
