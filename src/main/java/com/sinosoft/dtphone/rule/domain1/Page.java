package com.sinosoft.dtphone.rule.domain1;

import java.util.ArrayList;
import java.util.List;

public class Page {
	String pageNo="";
	List<Group> groups=new ArrayList<Group>();

	public List<Group> getGroups() {
		return groups;
	}

	public void setGroups(List<Group> groups) {
		this.groups = groups;
	}

	public String getPageNo() {
		return pageNo;
	}

	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
	}
}
