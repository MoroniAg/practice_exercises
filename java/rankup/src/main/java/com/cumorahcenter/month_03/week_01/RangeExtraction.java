package com.cumorahcenter.month_03.week_01;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Gabriel Aguilera on 3/4/23
 */
public class RangeExtraction {
	
	private RangeExtraction() {
		throw new IllegalStateException("Utility class");
	}
	
	public static String rangeExtraction(int[] arr) {
		var result = new ArrayList<String>();
		var list = Arrays.stream(arr).boxed().sorted().toList();
		for (int i = 0; i < list.size(); i++) {
			var index = i;
			var first = list.get(index);
			var last = first;
			while (last + 1 == list.get(index + 1 == list.size() ? index : index + 1)) {
				last = list.get(index + 1);
				index++;
			}
			i = index;
			String concat = Math.abs(last - first) == 1 ?
							String.valueOf(first).concat(",").concat(String.valueOf(last)) :
							first.equals(last) ?
							String.valueOf(first) :
							String.valueOf(first).concat("-").concat(String.valueOf(last));
			result.add(concat);
		}
		return String.join("," , result);
	}
	
}
