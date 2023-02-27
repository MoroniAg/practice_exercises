package com.cumorahcenter;

import com.cumorahcenter.month_02.week_01.HulaHoop;
import com.cumorahcenter.month_02.week_01.FindNeedle;
import com.cumorahcenter.month_02.week_01.TotalPoints;
import com.cumorahcenter.month_02.week_01.DnaStrand;
import com.cumorahcenter.month_02.week_02.CharProblem;
import com.cumorahcenter.month_02.week_02.Digitize;
import com.cumorahcenter.month_02.week_02.HelloWorld;
import com.cumorahcenter.month_02.week_02.HighAndLow;
import com.cumorahcenter.month_02.week_03.Alarm;
import com.cumorahcenter.month_02.week_03.MakeNegative;
import com.cumorahcenter.month_02.week_03.MinMax;
import com.cumorahcenter.month_02.week_03.Welcome;
import com.cumorahcenter.month_02.week_04.RentCarCost;
import com.cumorahcenter.month_02.week_04.Square;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest {
	@Test
	public void testHulaHoop() {
		assertEquals("Great, now move on to tricks" , HulaHoop.hoopCount(11));
		assertEquals("Keep at it until you get it" , HulaHoop.hoopCount(7));
	}
	
	@Test
	public void testFindNeedle() {
		Object[] haystack1 = {"3" , "123124234" , null , "needle" , "world" , "hay" , 2 , "3" , true , false};
		Object[] haystack2 = {"283497238987234" ,
				"a dog" ,
				"a cat" ,
				"some random junk" ,
				"a piece of hay" ,
				"needle" ,
				"something somebody lost a while ago"};
		Object[] haystack3 = {1 ,
				2 ,
				3 ,
				4 ,
				5 ,
				6 ,
				7 ,
				8 ,
				8 ,
				7 ,
				5 ,
				4 ,
				3 ,
				4 ,
				5 ,
				6 ,
				67 ,
				5 ,
				5 ,
				3 ,
				3 ,
				4 ,
				2 ,
				34 ,
				234 ,
				23 ,
				4 ,
				234 ,
				324 ,
				324 ,
				"needle" ,
				1 ,
				2 ,
				3 ,
				4 ,
				5 ,
				5 ,
				6 ,
				5 ,
				4 ,
				32 ,
				3 ,
				45 ,
				54};
		assertEquals("found the needle at position 3" , FindNeedle.findNeedle(haystack1));
		assertEquals("found the needle at position 5" , FindNeedle.findNeedle(haystack2));
		assertEquals("found the needle at position 30" , FindNeedle.findNeedle(haystack3));
	}
	
	@Test
	public void testTotalPoints() {
		assertEquals(30 ,
					 TotalPoints.points(new String[]{"1:0" ,
							 "2:0" ,
							 "3:0" ,
							 "4:0" ,
							 "2:1" ,
							 "3:1" ,
							 "4:1" ,
							 "3:2" ,
							 "4:2" ,
							 "4:3"}));
		assertEquals(10 ,
					 TotalPoints.points(new String[]{"1:1" ,
							 "2:2" ,
							 "3:3" ,
							 "4:4" ,
							 "2:2" ,
							 "3:3" ,
							 "4:4" ,
							 "3:3" ,
							 "4:4" ,
							 "4:4"}));
		assertEquals(0 ,
					 TotalPoints.points(new String[]{"0:1" ,
							 "0:2" ,
							 "0:3" ,
							 "0:4" ,
							 "1:2" ,
							 "1:3" ,
							 "1:4" ,
							 "2:3" ,
							 "2:4" ,
							 "3:4"}));
		assertEquals(15 ,
					 TotalPoints.points(new String[]{"1:0" ,
							 "2:0" ,
							 "3:0" ,
							 "4:0" ,
							 "2:1" ,
							 "1:3" ,
							 "1:4" ,
							 "2:3" ,
							 "2:4" ,
							 "3:4"}));
		assertEquals(12 ,
					 TotalPoints.points(new String[]{"1:0" ,
							 "2:0" ,
							 "3:0" ,
							 "4:4" ,
							 "2:2" ,
							 "3:3" ,
							 "1:4" ,
							 "2:3" ,
							 "2:4" ,
							 "3:4"}));
		
	}
	
	@Test
	public void testDnaStrand() {
		assertEquals("TTTT" , DnaStrand.makeComplement("AAAA"));
		assertEquals("TAACG" , DnaStrand.makeComplement("ATTGC"));
		assertEquals("CATA" , DnaStrand.makeComplement("GTAT"));
	}
	
	@Test
	public void testCharProblem() {
		assertEquals(5 , CharProblem.howOld("5 years old"));
		assertEquals(9 , CharProblem.howOld("9 years old"));
		assertEquals(1 , CharProblem.howOld("1 year old"));
	}
	
	@Test
	public void testHelloWorld() {
		assertEquals("hello world!" , HelloWorld.greet());
	}
	
	@Test
	public void testHighAndLow() {
		assertEquals("42 -9" , HighAndLow.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
		assertEquals("3 1" , HighAndLow.highAndLow("1 2 3"));
	}
	
	@Test
	public void testDigitize() {
		assertArrayEquals(new int[]{1 , 3 , 2 , 5 , 3} , Digitize.digitize(35231));
		assertArrayEquals(new int[]{0} , Digitize.digitize(0));
	}
	
	@Test
	public void setAlarmTest() {
		assertTrue("Should be true." , Alarm.setAlarm(true , false));
		assertFalse("Should be false." , Alarm.setAlarm(true , true));
		assertFalse("Should be false." , Alarm.setAlarm(false , false));
		assertFalse("Should be false." , Alarm.setAlarm(false , true));
	}
	
	@Test
	public void exampleTest() {
		assertEquals("Your function should have returned 'Welcome'. Try again." ,
					 "Welcome" ,
					 Welcome.greet("english"));
		assertEquals("Your function should have returned 'Welkom'. Try again." ,
					 "Welkom" ,
					 Welcome.greet("dutch"));
		assertEquals("Your function should have returned 'Welcome'. Try again." ,
					 "Welcome" ,
					 Welcome.greet("IP_ADDRESS_INVALID"));
	}
	
	@Test
	public void testMakeNegative() {
		assertEquals(-42 , MakeNegative.makeNegative(42));
	}
	
	@Test
	public void testExampleCases() {
		assertArrayEquals(new int[]{1 , 5} , MinMax.minMax(new int[]{1 , 2 , 3 , 4 , 5}));
		assertArrayEquals(new int[]{5 , 2334454} , MinMax.minMax(new int[]{2334454 , 5}));
		assertArrayEquals(new int[]{1 , 1} , MinMax.minMax(new int[]{1}));
	}
	
	@Test
	public void shouldWorkForSomeExamples() throws Exception {
		assertEquals("negative numbers aren't square numbers" , false , Square.isSquare(-1));
		assertEquals("0 is a square number (0 * 0)" , true , Square.isSquare(0));
		assertEquals("3 isn't a square number" , false , Square.isSquare(3));
		assertEquals("4 is a square number (2 * 2)" , true , Square.isSquare(4));
		assertEquals("25 is a square number (5 * 5)" , true , Square.isSquare(25));
		assertEquals("26 isn't a square number" , false , Square.isSquare(26));
	}
	
	@Test
	public void over7Tests() {
		assertEquals(230 , RentCarCost.rentalCarCost(7));
		assertEquals(270 , RentCarCost.rentalCarCost(8));
		assertEquals(310 , RentCarCost.rentalCarCost(9));
		assertEquals(350 , RentCarCost.rentalCarCost(10));
	}
}
