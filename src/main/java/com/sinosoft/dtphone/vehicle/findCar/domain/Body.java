package com.sinosoft.dtphone.vehicle.findCar.domain;

import java.util.ArrayList;
import java.util.List;

public class Body {
	String vehicle_Model;
	String rack_No;
	String owner;
	String vehicle_Register_Date;
	String limit_Load_Person;
	String engine_No;
	String Vehicle_Brand_1;
	List<Vehicle> vehicles=new ArrayList<Vehicle>();
	public void add(Vehicle vehicel){
		this.vehicles.add(vehicel);
	}
	public String getVehicle_Model() {
		return vehicle_Model;
	}
	public void setVehicle_Model(String vehicle_Model) {
		this.vehicle_Model = vehicle_Model;
	}
	public String getRack_No() {
		return rack_No;
	}
	public void setRack_No(String rack_No) {
		this.rack_No = rack_No;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getVehicle_Register_Date() {
		return vehicle_Register_Date;
	}
	public void setVehicle_Register_Date(String vehicle_Register_Date) {
		this.vehicle_Register_Date = vehicle_Register_Date;
	}
	public String getLimit_Load_Person() {
		return limit_Load_Person;
	}
	public void setLimit_Load_Person(String limit_Load_Person) {
		this.limit_Load_Person = limit_Load_Person;
	}
	public String getEngine_No() {
		return engine_No;
	}
	public void setEngine_No(String engine_No) {
		this.engine_No = engine_No;
	}
	public String getVehicle_Brand_1() {
		return Vehicle_Brand_1;
	}
	public void setVehicle_Brand_1(String vehicle_Brand_1) {
		Vehicle_Brand_1 = vehicle_Brand_1;
	}
	public List<Vehicle> getVehicles() {
		return vehicles;
	}
	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}
}
