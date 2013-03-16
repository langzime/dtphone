package com.sinosoft.dtphone.vehicle.findCar.main;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sinosoft.dtphone.vehicle.findCar.domain.Body;
import com.sinosoft.dtphone.vehicle.findCar.domain.Domain;
import com.sinosoft.dtphone.vehicle.findCar.domain.Head;
import com.sinosoft.dtphone.vehicle.findCar.domain.Vehicle;

public class Main {
	private static JsonGenerator jsonGenerator = null;
	private static ObjectMapper objectMapper = null;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		objectMapper = new ObjectMapper();
		String body = null;
		Domain test = null;
		try {
			test = getTB();
			jsonGenerator = objectMapper.getFactory().createJsonGenerator(
					System.out, JsonEncoding.UTF8);
			jsonGenerator.writeObject(test);
			// System.out.println();
			// objectMapper.writeValue(System.out, test);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static Domain getTB() {
		Domain dm = new Domain();
		Head head=new Head();
		head.setStatus("1");
		head.setErrorCode("001");
		head.setErrorMsg("成功");
		Body body=new Body();
		body.setEngine_No("FDSJALFJDSLAJFDSAUTR");
		body.setLimit_Load_Person("5");
		body.setOwner("边城浪子");
		body.setRack_No("FDJSALFJDSKLATURET");
		body.setVehicle_Model("");
		body.setVehicle_Register_Date("2012/01/03");
		body.setVehicle_Brand_1("雅阁");
		{
			Vehicle vehicel=new Vehicle();
			vehicel.setLicenseNo("京AJKLUE");
			vehicel.setModel("");
			vehicel.setModelCode("");
			vehicel.setModelDesc("");
			body.add(vehicel);
		}
		{
			Vehicle vehicel=new Vehicle();
			vehicel.setLicenseNo("京AJKLUE");
			vehicel.setModel("");
			vehicel.setModelCode("");
			vehicel.setModelDesc("");
			body.add(vehicel);
		}
		dm.setHead(head);
		dm.setBody(body);
		return dm;
	}
}
