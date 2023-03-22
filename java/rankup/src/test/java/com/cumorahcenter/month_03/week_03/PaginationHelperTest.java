package com.cumorahcenter.month_03.week_03;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by Gabriel Aguilera on 3/21/23
 */
public class PaginationHelperTest {
	
	private PaginationHelper<String> initArray() {
		var list = Arrays.asList("1" , "2" , "3" , "4" , "5" , "6");
		return new PaginationHelper<>(list , 4);
	}
	private PaginationHelper<String> initArray2() {
		var list = Arrays.asList("1" , "2" , "3" , "4" , "5" , "6");
		return new PaginationHelper<>(list , 2);
	}
	
	@Test
	public void testInitWithPage4() {
		var paginationHelper = initArray();
		Assert.assertEquals(6 , paginationHelper.itemCount());
		Assert.assertEquals(2 , paginationHelper.pageCount());
	}
	@Test
	public void testInitWithPage2() {
		var paginationHelper = initArray2();
		Assert.assertEquals(6 , paginationHelper.itemCount());
		Assert.assertEquals(3 , paginationHelper.pageCount());
	}
	@Test
	public void testPageItemCount() {
		var paginationHelper = initArray();
		Assert.assertEquals(4 , paginationHelper.pageItemCount(0));
	}
	
	@Test
	public void testPageIndex() {
		var paginationHelper = initArray();
		Assert.assertEquals(1 , paginationHelper.pageIndex(5));
	}
	
	
}