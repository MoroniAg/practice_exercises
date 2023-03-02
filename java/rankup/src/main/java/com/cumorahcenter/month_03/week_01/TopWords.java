package com.cumorahcenter.month_03.week_01;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * Created by Gabriel Aguilera on 3/1/23
 */
public class TopWords {
	
	private TopWords() {
		throw new IllegalStateException("Utility class");
	}
	
	public static List<String> top3(String s) {
		s = s.replaceAll("[^\\w' ]+" , "");
		var map = new HashMap<String, Integer>();
		var tokens = new StringTokenizer(s , " ");
		while (tokens.hasMoreTokens()) {
			var token = tokens.nextToken();
			boolean matches = token.matches("^(?=.*\\w').+$|\\w+");
			if (matches && map.containsKey(token.toLowerCase())) {
				map.put(token.toLowerCase() , map.get(token.toLowerCase()) + 1);
			} else if (matches) {
				map.put(token.toLowerCase() , 1);
			}
		}
		return map.entrySet()
				  .stream()
				  .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				  .limit(3)
				  .map(Map.Entry::getKey)
				  .toList();
	}
	
}
