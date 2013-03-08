package com.sinosoft.dtphone.rule.domain1;

import java.util.ArrayList;
import java.util.List;

public class Group {
	String groupName="";
	List<Element> groups=new ArrayList<Element>();
	public void add(Element element){
		this.groups.add(element);
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public List<Element> getGroups() {
		return groups;
	}
	public void setGroups(List<Element> groups) {
		this.groups = groups;
	}
}
