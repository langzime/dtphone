package com.sinosoft.dtphone.rule.domain;

public class Element {
	String page="";//所在的页面
	String type="";//节点类型 textbox
	String id="";//节点id
	String value="";//默认值
	String group="";//所在组
	String label="";//标签值
	Condition Condition=new Condition();
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	public Condition getCondition() {
		return Condition;
	}
	public void setCondition(Condition condition) {
		Condition = condition;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
}
