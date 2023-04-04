package com.cumorahcenter;

import static java.util.Arrays.*;
import static org.junit.Assert.*;

import com.cumorahcenter.month_02.week_05.PigLatin;
import com.cumorahcenter.month_02.week_05.RgbToHex;
import com.cumorahcenter.month_03.week_01.RangeExtraction;
import com.cumorahcenter.month_03.week_01.TopWords;
import com.cumorahcenter.month_03.week_02.ConvertToIPv4;
import com.cumorahcenter.month_03.week_02.PerfectPower;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.StringJoiner;

/**
 * Unit test for simple App.
 */
public class AppTest {
	/**
	 * Rigorous Test :-)
	 */
	@Test
	public void shouldAnswerWithTrue() {
		assertTrue(true);
	}
	
	@Test
	public void sampleTests() {
		assertEquals("For input: (0, 0, 0)" , "000000" , RgbToHex.rgb(0 , 0 , 0));
		assertEquals("For input: (1, 2, 3)" , "010203" , RgbToHex.rgb(1 , 2 , 3));
		assertEquals("For input: (255, 255, 255)" , "FFFFFF" , RgbToHex.rgb(255 , 255 , 255));
		assertEquals("For input: (254, 253, 252)" , "FEFDFC" , RgbToHex.rgb(254 , 253 , 252));
		assertEquals("For input: (-20, 275, 125)" , "00FF7D" , RgbToHex.rgb(-20 , 275 , 125));
	}
	
	@Test
	public void FixedTests() {
		assertEquals("igPay atinlay siay oolcay" , PigLatin.pigIt("Pig latin is cool"));
		assertEquals("hisTay siay ymay tringsay" , PigLatin.pigIt("This is my string"));
		assertEquals("elloHay orldway !" , PigLatin.pigIt("Hello world !"));
	}
	
	@Test
	public void testTopWprd() {
		assertEquals(asList("e" , "d" , "a") , TopWords.top3("a a a  b  c c  d d d d  e e e e e"));
		assertEquals(asList("e" , "ddd" , "aa") ,
					 TopWords.top3("e e e e DDD ddd DdD: ddd ddd aa aA Aa, bb cc cC e e e"));
		assertEquals(asList("won't" , "wont") , TopWords.top3("  //wont won't won't "));
		assertEquals(List.of("e") , TopWords.top3("  , e   .. "));
		assertEquals(new ArrayList<>() , TopWords.top3("  ...  "));
		assertEquals(new ArrayList<>() , TopWords.top3("  '  "));
		assertEquals(new ArrayList<>() , TopWords.top3("  '''  "));
		StringJoiner joiner = new StringJoiner("\n");
		for (String s : Arrays.asList(
				"In a village of La Mancha, the name of which I have no desire to call to" ,
				"mind, there lived not long since one of those gentlemen that keep a lance" ,
				"in the lance-rack, an old buckler, a lean hack, and a greyhound for" ,
				"coursing. An olla of rather more beef than mutton, a salad on most" ,
				"nights, scraps on Saturdays, lentils on Fridays, and a pigeon or so extra" ,
				"on Sundays, made away with three-quarters of his income.")) {
			joiner.add(s);
		}
		assertEquals(asList("a" , "of" , "on") , TopWords.top3(joiner.toString()));
	}
	
	@Test
	public void test_BasicTests() {
		assertEquals("-6,-3-1,3-5,7-11,14,15,17-20" ,
					 RangeExtraction.rangeExtraction(new int[]{-6 ,
							 -3 ,
							 -2 ,
							 -1 ,
							 0 ,
							 1 ,
							 3 ,
							 4 ,
							 5 ,
							 7 ,
							 8 ,
							 9 ,
							 10 ,
							 11 ,
							 14 ,
							 15 ,
							 17 ,
							 18 ,
							 19 ,
							 20}));
		assertEquals("-3--1,2,10,15,16,18-20" ,
					 RangeExtraction.rangeExtraction(new int[]{-3 ,
							 -2 ,
							 -1 ,
							 2 ,
							 10 ,
							 15 ,
							 16 ,
							 18 ,
							 19 ,
							 20}));
	}
	
	@Test
	public void perfectPower() {
		assertNull("0 is not a perfect number" , PerfectPower.isPerfectPower(0));
		assertNull("1 is not a perfect number" , PerfectPower.isPerfectPower(1));
		assertNull("2 is not a perfect number" , PerfectPower.isPerfectPower(2));
		assertNull("3 is not a perfect number" , PerfectPower.isPerfectPower(3));
		assertArrayEquals("4 = 2^2" , new int[]{2 , 2} , PerfectPower.isPerfectPower(4));
		assertNull("5 is not a perfect power" , PerfectPower.isPerfectPower(5));
		assertArrayEquals("8 = 2^3" , new int[]{2 , 3} , PerfectPower.isPerfectPower(8));
		assertArrayEquals("9 = 3^2" , new int[]{3 , 2} , PerfectPower.isPerfectPower(9));
		
		
	}
	
	@Test
	public void testUpTo500() {
		int[] pp = {4 ,
				8 ,
				9 ,
				16 ,
				25 ,
				27 ,
				32 ,
				36 ,
				49 ,
				64 ,
				81 ,
				100 ,
				121 ,
				125 ,
				128 ,
				144 ,
				169 ,
				196 ,
				216 ,
				225 ,
				243 ,
				256 ,
				289 ,
				324 ,
				343 ,
				361 ,
				400 ,
				441 ,
				484};
		for (int i : pp) {
			assertNotNull(i + " is a perfect power" , PerfectPower.isPerfectPower(i));
		}
	}
	
	@Test
	public void testRandomPerfectPowers() {
		Random rnd = new Random();
		for (int i = 0; i < 10; i++) {
			int m = rnd.nextInt(254)+2;
			int k = (int)(rnd.nextDouble()*(Math.log(Integer.MAX_VALUE)/Math.log(m)-2.0)+2.0);
			int l = ipow(m, k);
			int[] r = PerfectPower.isPerfectPower(l);
			assertNotNull(l+" is a perfect power", r);
			assertEquals(r[0]+"^"+r[1]+"!="+l, l, ipow(r[0], r[1]));
		}
	}
	
	@Test
	public void testRandomNumbers() {
		Random rnd = new Random();
		for (int i = 0; i < 1; i++) {
			int l = rnd.nextInt(Integer.MAX_VALUE);
			int[] r = PerfectPower.isPerfectPower(l);
			if (r != null) assertEquals(r[0]+"^"+r[1]+"!="+l, l, ipow(r[0], r[1]));
		}
	}
	private static int ipow(int b, int e) {
		int p = 1;
		for (; e > 0; e >>= 1) {
			if ((e & 1) == 1) p *= b;
			b *= b;
		}
		return p;
	}
	
	@Test
	public void sampleTest() {
		assertEquals("128.114.17.104", ConvertToIPv4.longToIP(2154959208L));
		assertEquals("0.0.0.0", ConvertToIPv4.longToIP(0));
		assertEquals("128.32.10.1", ConvertToIPv4.longToIP(2149583361L));
	}
	
}
