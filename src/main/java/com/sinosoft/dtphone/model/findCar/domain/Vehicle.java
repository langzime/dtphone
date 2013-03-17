package com.sinosoft.dtphone.model.findCar.domain;

public class Vehicle {
	String picPath;
	String familyName;
	String engineDesc;
	String parentVehName;
	String seat;
	String price;
	String parentId;
	public String getPicPath() {
		return picPath;
	}
	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}
	public String getFamilyName() {
		return familyName;
	}
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	public String getEngineDesc() {
		return engineDesc;
	}
	public void setEngineDesc(String engineDesc) {
		this.engineDesc = engineDesc;
	}
	public String getParentVehName() {
		return parentVehName;
	}
	public void setParentVehName(String parentVehName) {
		this.parentVehName = parentVehName;
	}
	public String getSeat() {
		return seat;
	}
	public void setSeat(String seat) {
		this.seat = seat;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
}
