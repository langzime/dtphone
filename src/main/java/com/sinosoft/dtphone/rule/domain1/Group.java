package com.sinosoft.dtphone.rule.domain1;

import java.util.ArrayList;
import java.util.List;

public class Group {
	String groupName="";
	List<Element> elements=new ArrayList<Element>();
	public void add(Element element){
		this.elements.add(element);
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public List<Element> getElements() {
		return elements;
	}
	public void setElements(List<Element> elements) {
		this.elements = elements;
	}
}
