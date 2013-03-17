package com.sinosoft.dtphone.model.selectedCar.Main;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sinosoft.dtphone.model.selectedCar.domain.Body;
import com.sinosoft.dtphone.model.selectedCar.domain.Domain;
import com.sinosoft.dtphone.model.selectedCar.domain.Head;
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
		body.setAliasName("歌诗图2.4L AT尊享版");
		body.setStandardName("歌诗图HG7240EAAV");
		body.setSeatFlag("");
		dm.setHead(head);
		dm.setBody(body);
		return dm;
	}
}
