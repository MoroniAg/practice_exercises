package com.cumorahcenter.month_02.week_04;

/**
 * Created by Gabriel Aguilera on 2/27/23
 */
public class RentCarCost {
	
	private static final int COST_PER_DAY = 40;
	
	public static int rentalCarCost(int days) {
		return days >= 7 ?
			   COST_PER_DAY * days - 50 :
			   days >= 3 ? COST_PER_DAY * days - 20 : COST_PER_DAY * days;
		
	}
	
}
