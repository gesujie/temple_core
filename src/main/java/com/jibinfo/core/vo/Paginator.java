/**
 * jibinfo
 * 2016-06-28-下午4:33:38
 * 2016南京坚卓软件科技有限公司-版权所有
 */
package com.jibinfo.core.vo;

import java.io.Serializable;
import java.util.List;

import lombok.ToString;
@ToString
public class Paginator implements Serializable {
	private static final long serialVersionUID = 2018436532193281591L;
	public static final int DEFAULT_ITEMS_PER_PAGE = 20;
	public static final int DEFAULT_SLIDER_SIZE = 7;
	public static final int UNKNOWN_ITEMS = 2147483647;
	private int page;
	private int items;
	private int itemsPerPage;
	private String sortField;
	private String sortType;
	private Object params;
	private List<?> results;

	public Paginator() {
		this(0);
	}

	public Paginator(int itemsPerPage) {
		this(itemsPerPage, 2147483647);
	}

	public Paginator(int itemsPerPage, int items) {
		this.items = (items >= 0 ? items : 0);
		this.itemsPerPage = (itemsPerPage > 0 ? itemsPerPage : 20);
		this.page = calcPage(0);
	}

	public Object getParams() {
		return this.params;
	}

	public void setParams(Object params) {
		this.params = params;
	}

	public List<?> getResults() {
		return this.results;
	}

	public void setResults(List<?> results) {
		this.results = results;
	}

	public int getPages() {
		return (int) Math.ceil(this.items / this.itemsPerPage);
	}

	public int getPage() {
		return this.page;
	}

	public int setPage(int page) {
		return this.page = calcPage(page);
	}

	public int getItems() {
		return this.items;
	}

	public int setItems(int items) {
		this.items = (items >= 0 ? items : 0);
		return this.items;
	}

	public int getItemsPerPage() {
		return this.itemsPerPage;
	}

	public int setItemsPerPage(int itemsPerPage) {
		this.itemsPerPage = (itemsPerPage > 0 ? itemsPerPage : 20);
		return this.itemsPerPage;
	}

	public int getOffset() {
		return this.page > 0 ? this.itemsPerPage * (this.page - 1) : 0;
	}

	public int getLength() {
		if (this.page > 0) {
			return Math.min(this.itemsPerPage * this.page, this.items)
					- this.itemsPerPage * (this.page - 1);
		}

		return 0;
	}

	public int getBeginIndex() {
		if (this.page > 0) {
			return this.itemsPerPage * (this.page - 1) + 1;
		}
		return 0;
	}

	public int getEndIndex() {
		if (this.page > 0) {
			return Math.min(this.itemsPerPage * this.page, this.items);
		}
		return 0;
	}

	public int setItem(int itemOffset) {
		return setPage(itemOffset / this.itemsPerPage + 1);
	}

	public int firstPage() {
		return calcPage(1);
	}

	public int lastPage() {
		return calcPage(getPages());
	}

	public int previousPage() {
		return calcPage(this.page - 1);
	}

	public int previousPage(int n) {
		return calcPage(this.page - n);
	}

	public int nextPage() {
		return calcPage(this.page + 1);
	}

	public int nextPage(int n) {
		return calcPage(this.page + n);
	}

	public boolean enablePage(int page) {
		boolean returnVal = (page < 1) || (page > getPages());
		return !returnVal;
	}

	public int[] slider() {
		return slider(7);
	}

	public int[] slider(int width) {
		int pages = getPages();

		if ((pages < 1) || (width < 1)) {
			return new int[0];
		}
		if (width > pages) {
			width = pages;
		}

		int[] slider = new int[width];
		int first = this.page - (width - 1) / 2;

		if (first < 1) {
			first = 1;
		}

		if (first + width - 1 > pages) {
			first = pages - width + 1;
		}

		for (int i = 0; i < width; i++) {
			slider[i] = (first + i);
		}

		return slider;
	}

	protected int calcPage(int page) {
		int pages = getPages();

		if (pages > 0) {
			return page > pages ? pages : page < 1 ? 1 : page;
		}

		return 0;
	}

	public String getSortField() {
		return this.sortField;
	}

	public void setSortField(String sortField) {
		this.sortField = sortField;
	}

	public String getSortType() {
		return this.sortType;
	}

	public void setSortType(String sortType) {
		this.sortType = sortType;
	}
}