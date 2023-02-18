package com.cumorahcenter.exercise_03;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Gabriel Aguilera on 2/17/23
 */
public class TotalPoints {
	
	public static int points(String[] games) {
		var result = new AtomicInteger(0);
		Arrays.asList(games).forEach(game -> {
			String[] split = game.split(":");
			var x = Integer.valueOf(split[0]);
			var y = Integer.valueOf(split[1]);
			if (x > y) {
				result.addAndGet(3)  ;
			} else if (x == y) {
				result.addAndGet(1)  ;
			}
			
		});
		return result.get();
	}
}
