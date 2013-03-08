package com.sinosoft.dtphone.rule.domain1;

public class SubEvent {
	String targetIds="";//目标元素的id
	String targetAttr="";//一个属性
	String targetVal="";//属性的值
	public String getTargetIds() {
		return targetIds;
	}
	public void setTargetIds(String targetIds) {
		this.targetIds = targetIds;
	}
	public String getTargetAttr() {
		return targetAttr;
	}
	public void setTargetAttr(String targetAttr) {
		this.targetAttr = targetAttr;
	}
	public String getTargetVal() {
		return targetVal;
	}
	public void setTargetVal(String targetVal) {
		this.targetVal = targetVal;
	}
}
