package com.cumorahcenter.month_02.week_04;

/**
 * Created by Gabriel Aguilera on 2/28/23
 */
public class FormulasPolygons {
	
	public static double getVolumeOfCuboid(final double length , final double width , final double height) {
		// Your code here
		return length * width * height;
	}
	
	public static int areaOrPerimeter(int l , int w) {
		return l > w || l < w ? l*2+w*2 : l * w;
	}
	
}
