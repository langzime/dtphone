package com.sinosoft.dtphone.rule.domain;

import java.util.ArrayList;
import java.util.List;

public class Condition {
	String checked = "";// 是否选中
	String disPlay = "";// 是否显示
	String readOnly = "";// 是否可读
	String maxLength = "";// 长度
	String upper = "";// 是否大写
	String allowEmpty = "";// 是否运行为空

	Date Date = new Date();// 是否作为实践框
	/*
	 * String haveToDate="";//有没有关联时间 String toDateId; String range;//1Y
	 */
	List<Event> events = new ArrayList<Event>();

	public void addEvent(Event event) {
		this.events.add(event);
	}

	public String getChecked() {
		return checked;
	}

	public void setChecked(String checked) {
		this.checked = checked;
	}

	public String getDisPlay() {
		return disPlay;
	}

	public Date getDate() {
		return Date;
	}

	public void setDate(Date date) {
		Date = date;
	}

	public void setDisPlay(String disPlay) {
		this.disPlay = disPlay;
	}

	public String getReadOnly() {
		return readOnly;
	}

	public void setReadOnly(String readOnly) {
		this.readOnly = readOnly;
	}

	public List<Event> getEvents() {
		return events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}

	public String getMaxLength() {
		return maxLength;
	}

	public void setMaxLength(String maxLength) {
		this.maxLength = maxLength;
	}

	public String getUpper() {
		return upper;
	}

	public void setUpper(String upper) {
		this.upper = upper;
	}

	public String getAllowEmpty() {
		return allowEmpty;
	}

	public void setAllowEmpty(String allowEmpty) {
		this.allowEmpty = allowEmpty;
	}
}
