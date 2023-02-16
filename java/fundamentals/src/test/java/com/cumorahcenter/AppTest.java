package com.cumorahcenter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.cumorahcenter.exercise_01.HulaHoop;
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
}
