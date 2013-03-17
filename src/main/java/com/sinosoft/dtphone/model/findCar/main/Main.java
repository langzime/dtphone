package com.sinosoft.dtphone.model.findCar.main;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sinosoft.dtphone.model.findCar.domain.Body;
import com.sinosoft.dtphone.model.findCar.domain.Domain;
import com.sinosoft.dtphone.model.findCar.domain.Head;
import com.sinosoft.dtphone.model.findCar.domain.Vehicle;

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
		Head head = new Head();
		head.setStatus("1");
		head.setErrorCode("001");
		head.setErrorMsg("成功");
		Body body = new Body();
		body.setVehicleNo("2");
		{
			Vehicle vehicle = new Vehicle();
			vehicle.setPicPath("/export/home/picccar/jy/pics/group/BTA1AA01/small/small_BTA1AA01_2.jpg");
			vehicle.setParentVehName("2012款 尊享版");
			vehicle.setParentId("4028b2883696f90c0136a997477c1daa");
			vehicle.setEngineDesc("HG7240EAAV");
			vehicle.setPrice("270800.0");
			vehicle.setSeat("5");
			vehicle.setFamilyName("歌诗图");
			body.add(vehicle);
		}
		{
			Vehicle vehicle = new Vehicle();
			vehicle.setPicPath("/export/home/picccar/jy/pics/group/BTA1AL02/small/small_BTA1AL02_1.jpg");
			vehicle.setParentVehName("2006-2007款 豪华版/导航");
			vehicle.setFamilyName("雅阁");
			vehicle.setParentId("6206867fc057ffc800000000f4909128");
			vehicle.setEngineDesc("HG7240A(2.4 i-VTEC)");
			vehicle.setPrice("204800.0");
			vehicle.setSeat("5");
			body.add(vehicle);
		}
		dm.setHead(head);
		dm.setBody(body);
		return dm;
	}
}
