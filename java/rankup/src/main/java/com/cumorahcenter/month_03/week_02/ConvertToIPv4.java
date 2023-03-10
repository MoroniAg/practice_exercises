package com.cumorahcenter.month_03.week_02;

import java.util.ArrayList;

/**
 * Created by Gabriel Aguilera on 3/10/23
 */
public class ConvertToIPv4 {
	
	public static void main(String[] args) {
		long number = 258L;
		//		System.out.println(Long.toBinaryString(number) + " " + Long.toBinaryString(number).length());
		//		System.out.println(Long.parseLong("0000000100000000" , 2));
		//		System.out.println(Long.toBinaryString(128) +
		//						   "." +
		//						   Long.toBinaryString(32) +
		//						   "." +
		//						   Long.toBinaryString(10) +
		//						   "." +
		//						   Long.toBinaryString(1));
		System.out.println(((number >> 24) & 0xFF) + "." +
						   ((number >> 16) & 0xFF) + "." +
						   ((number >> 8) & 0xFF) + "." +
						   (number & 0xFF));
	}
	
	public static String longToIP(long ip) {
		var ipString = Long.toBinaryString(ip);
		if (ip == 0) {
			return new String("0.0.0.0");
		} else if (ipString.length() <= 8) {
			return new String("0.0.0.").concat(obtainOctet(ipString , 8));
		} else if (ipString.length() <= 16) {
			return new String("0.0.").concat(obtainOctet(String.format("%0" + (16 - ipString.length()) + "d" ,
																	   0).concat(ipString) , 16));
		} else if (ipString.length() <= 24) {
			return new String("0.").concat(obtainOctet(String.format("%0" + (24 - ipString.length()) + "d" ,
																	 0).concat(ipString) , 24));
		} else {
			var length = 32 - ipString.length();
			return obtainOctet(length == 0 ?
							   ipString :
							   String.format("%0" + length + "d" , 0).concat(ipString) , 32);
		}
	}
	
	private static String obtainOctet(String ipString , int limit) {
		var result = new ArrayList<String>();
		var init = 0;
		while (init < limit) {
			result.add(String.valueOf(Long.parseLong(ipString.substring(init , init + 8) , 2)));
			init += 8;
		}
		return String.join("." , result);
	}
	
	
}
