package com.cumorahcenter.month_03.week_03;

import java.util.List;

/**
 * Created by Gabriel Aguilera on 3/21/23
 */
public class PaginationHelper<I> {
	
	private List<I> collection;
	private int itemsPerPage;
	
	/**
	 * The constructor takes in an array of items and an integer indicating how many
	 * items fit within a single page
	 */
	public PaginationHelper(List<I> collection , int itemsPerPage) {
		this.collection = collection;
		this.itemsPerPage = itemsPerPage;
	}
	
	/**
	 * returns the number of items within the entire collection
	 */
	public int itemCount() {
		return this.collection.size();
	}
	
	/**
	 * returns the number of pages
	 */
	public int pageCount() {
		var divisor = this.itemCount() / this.itemsPerPage;
		return this.itemCount() % this.itemsPerPage == 0 ? divisor : divisor + 1;
	}
	
	/**
	 * returns the number of items on the current page. page_index is zero based.
	 * this method should return -1 for pageIndex values that are out of range
	 */
	public int pageItemCount(int pageIndex) {
		return pageIndex;
	}
	
	/**
	 * determines what page an item is on. Zero based indexes
	 * this method should return -1 for itemIndex values that are out of range
	 */
	public int pageIndex(int itemIndex) {
		return itemIndex;
	}
	
}
