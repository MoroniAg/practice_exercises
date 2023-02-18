package com.cumorahcenter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.cumorahcenter.exercise_01.HulaHoop;
import com.cumorahcenter.exercise_02.FindNeedle;
import com.cumorahcenter.exercise_03.TotalPoints;
import org.junit.Test;

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
					 TotalPoints.points(new String[]{"1:0" , "2:0" , "3:0" , "4:0" , "2:1" , "3:1" , "4:1" , "3:2" , "4:2" , "4:3"}));
		assertEquals(10 ,
					 TotalPoints.points(new String[]{"1:1" , "2:2" , "3:3" , "4:4" , "2:2" , "3:3" , "4:4" , "3:3" , "4:4" , "4:4"}));
		assertEquals(0 ,
					 TotalPoints.points(new String[]{"0:1" , "0:2" , "0:3" , "0:4" , "1:2" , "1:3" , "1:4" , "2:3" , "2:4" , "3:4"}));
		assertEquals(15 ,
					 TotalPoints.points(new String[]{"1:0" , "2:0" , "3:0" , "4:0" , "2:1" , "1:3" , "1:4" , "2:3" , "2:4" , "3:4"}));
		assertEquals(12 ,
					 TotalPoints.points(new String[]{"1:0" , "2:0" , "3:0" , "4:4" , "2:2" , "3:3" , "1:4" , "2:3" , "2:4" , "3:4"}));
		
	}
}
