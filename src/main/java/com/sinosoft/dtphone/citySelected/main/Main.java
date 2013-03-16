package com.sinosoft.dtphone.citySelected.main;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sinosoft.dtphone.citySelected.domain.Body;
import com.sinosoft.dtphone.citySelected.domain.Domain;
import com.sinosoft.dtphone.citySelected.domain.Head;

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
		body.setIsSpecial("0");
		body.setProSelected("");
		body.setCitySelected("");
		dm.setHead(head);
		dm.setBody(body);
		return dm;
	}
}
