package com.cumorahcenter;

import static java.util.Arrays.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.cumorahcenter.month_02.week_05.PigLatin;
import com.cumorahcenter.month_02.week_05.RgbToHex;
import com.cumorahcenter.month_03.week_01.RangeExtraction;
import com.cumorahcenter.month_03.week_01.TopWords;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
	
}
