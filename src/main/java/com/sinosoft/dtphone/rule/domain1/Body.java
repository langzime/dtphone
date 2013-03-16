package com.sinosoft.dtphone.rule.domain1;

import java.util.ArrayList;
import java.util.List;

public class Body {
	List<Page> pages=new ArrayList<Page>();
	public void add(Page page){
		this.pages.add(page);
	}
	public List<Page> getPages() {
		return pages;
	}
	public void setPages(List<Page> pages) {
		this.pages = pages;
	}
}
