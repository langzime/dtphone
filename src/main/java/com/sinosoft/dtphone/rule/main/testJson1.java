package com.sinosoft.dtphone.rule.main;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sinosoft.dtphone.rule.domain1.Condition;
import com.sinosoft.dtphone.rule.domain1.Element;
import com.sinosoft.dtphone.rule.domain1.Event;
import com.sinosoft.dtphone.rule.domain1.Group;
import com.sinosoft.dtphone.rule.domain1.Page;
import com.sinosoft.dtphone.rule.domain1.RuleBean;
import com.sinosoft.dtphone.rule.domain1.SubEvent;


public class testJson1 {
	private static JsonGenerator jsonGenerator = null;
	private static ObjectMapper objectMapper = null;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		objectMapper = new ObjectMapper();
		RuleBean test = null;
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

	public static RuleBean getTB() {
		RuleBean rb=new RuleBean();
		Page page1=new Page();
		page1.setPageNo("1");
		Group group=new Group();
		group.setGroupName("");
		Element element=new Element();
		element.setId("");
		element.setType("textbox");
		element.setValue("");
		element.setLabel("车牌号");
		Condition conditon=new Condition();
		conditon.setAllowEmpty("false");
		conditon.setChecked("true");
		conditon.setDisPlay("true");
		conditon.setMaxLength("6");
		conditon.setReadOnly("false");
		conditon.setUpper("true");
		Event event=new Event();
		event.setAction("checked");
		SubEvent subEvent=new SubEvent();
		subEvent.setTargetIds("");
		subEvent.setTargetAttr("");
		subEvent.setTargetVal("");
		Page page2=new Page();
		Page page3=new Page();
		Page page4=new Page();
		
		return rb;
	}

}

