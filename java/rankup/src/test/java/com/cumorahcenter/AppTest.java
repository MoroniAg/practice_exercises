package com.cumorahcenter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.cumorahcenter.month_02.week_05.PigLatin;
import com.cumorahcenter.month_02.week_05.RgbToHex;
import org.junit.Test;

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
}
