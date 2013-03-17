package com.sinosoft.dtphone.model.findCar.domain;

import java.util.ArrayList;
import java.util.List;

public class Body {
	String vehicleNo;
	List<Vehicle> vehicle=new ArrayList<Vehicle>();
	public void add(Vehicle vehicel){
		this.vehicle.add(vehicel);
	}
	public String getVehicleNo() {
		return vehicleNo;
	}
	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	public List<Vehicle> getVehicle() {
		return vehicle;
	}
	public void setVehicle(List<Vehicle> vehicle) {
		this.vehicle = vehicle;
	}
}
