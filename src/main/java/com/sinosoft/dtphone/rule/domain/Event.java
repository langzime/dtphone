package com.sinosoft.dtphone.rule.domain;

import java.util.ArrayList;
import java.util.List;


public class Event {
	String action="";//操作 选中
	
	/*String conditionId;//条件id
	String conditionAttr;//一个属性
	String conditionVal;//属性的值
	 */	
	List<SubEvent> subEvent=new ArrayList<SubEvent>();
	public void add(SubEvent subEvent){
		this.subEvent.add(subEvent);
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public List<SubEvent> getSubEvent() {
		return subEvent;
	}
	public void setSubEvent(List<SubEvent> subEvent) {
		this.subEvent = subEvent;
	}
}
