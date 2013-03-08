package com.sinosoft.dtphone.rule.domain;

public class Date {
	String isDate="";//是否作为实践框
	String dateFormat="";//格式化字符串yyyy/MM/dd
	String minDate="";//自身时间区间 20130305,
	String haveSubHour="";//是否有选择小时
	String subHourId="";//
	public String getIsDate() {
		return isDate;
	}
	public void setIsDate(String isDate) {
		this.isDate = isDate;
	}
	public String getDateFormat() {
		return dateFormat;
	}
	public void setDateFormat(String dateFormat) {
		this.dateFormat = dateFormat;
	}
	public String getMinDate() {
		return minDate;
	}
	public void setMinDate(String minDate) {
		this.minDate = minDate;
	}
	public String getHaveSubHour() {
		return haveSubHour;
	}
	public void setHaveSubHour(String haveSubHour) {
		this.haveSubHour = haveSubHour;
	}
	public String getSubHourId() {
		return subHourId;
	}
	public void setSubHourId(String subHourId) {
		this.subHourId = subHourId;
	}
}
