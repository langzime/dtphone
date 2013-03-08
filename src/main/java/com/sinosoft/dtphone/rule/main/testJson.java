package com.sinosoft.dtphone.rule.main;

import java.io.IOException;
import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sinosoft.dtphone.rule.domain.Condition;
import com.sinosoft.dtphone.rule.domain.Date;
import com.sinosoft.dtphone.rule.domain.Element;
import com.sinosoft.dtphone.rule.domain.Event;
import com.sinosoft.dtphone.rule.domain.RuleBean;
import com.sinosoft.dtphone.rule.domain.SubEvent;

public class testJson {
	private static JsonGenerator jsonGenerator = null;
	private static ObjectMapper objectMapper = null;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		objectMapper = new ObjectMapper();
		String body = null;
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
		RuleBean tb = new RuleBean();
		tb.setErrorCode("001");
		tb.setErrorMsg("返回成功");
		tb.setStatus("1");
		{
			Element element = new Element();
			element.setId("isNew");
			element.setPage("1");
			element.setType("checkbox");
			element.setValue("");
			element.setLabel("车牌号");

			Condition condition = new Condition();
			condition.setAllowEmpty("");
			condition.setChecked("false");
			condition.setDisPlay("true");
			condition.setMaxLength("");
			condition.setReadOnly("");
			condition.setUpper("");
			element.setCondition(condition);

			Event event = new Event();
			event.setAction("checked");
			{
				SubEvent subEvent = new SubEvent();
				subEvent.setTargetIds("AppliMobile,AppliEmail");
				subEvent.setTargetAttr("display");
				subEvent.setTargetVal("true");
				event.add(subEvent);
			}
			{
				SubEvent subEvent = new SubEvent();
				subEvent.setTargetIds("LicenseNo");
				subEvent.setTargetAttr("value");
				subEvent.setTargetVal("京*");//相当于append
				event.add(subEvent);
			}
			condition.addEvent(event);
			tb.add(element);
		}
		{
			Element element = new Element();
			element.setId("LicenseNo");
			element.setPage("1");
			element.setType("textbox");
			element.setValue("京");
			element.setLabel("车主姓名");
			
			Condition condition = new Condition();
			condition.setAllowEmpty("false");
			condition.setChecked("");
			condition.setDisPlay("true");
			condition.setMaxLength("7");
			condition.setReadOnly("false");
			condition.setUpper("");
			element.setCondition(condition);

			tb.add(element);
		}
		{
			Element element = new Element();
			element.setId("AppliMobile");
			element.setPage("1");
			element.setType("textbox");
			element.setValue("");
			element.setLabel("电话");

			Condition condition = new Condition();
			condition.setAllowEmpty("false");
			condition.setChecked("");
			condition.setDisPlay("true");
			condition.setMaxLength("11");
			condition.setReadOnly("false");
			condition.setUpper("");
			element.setCondition(condition);

			tb.add(element);
		}
		{
			Element element = new Element();
			element.setId("AppliEmail");
			element.setPage("1");
			element.setType("textbox");
			element.setValue("");
			element.setLabel("电子邮箱");

			Condition condition = new Condition();
			condition.setAllowEmpty("false");
			condition.setChecked("");
			condition.setDisPlay("true");
			condition.setMaxLength("20");
			condition.setReadOnly("");
			condition.setUpper("");
			element.setCondition(condition);

			tb.add(element);
		}
		{
			Element element = new Element();
			element.setId("FrameNo");
			element.setPage("1");
			element.setType("textbox");
			element.setValue("");
			element.setLabel("车辆识别码/车架号 ");

			Condition condition = new Condition();
			condition.setAllowEmpty("false");
			condition.setChecked("");
			condition.setDisPlay("true");
			condition.setMaxLength("20");
			condition.setReadOnly("");
			condition.setUpper("");
			element.setCondition(condition);

			tb.add(element);
		}
		{
			Element element = new Element();
			element.setId("EngineNo");
			element.setPage("1");
			element.setType("textbox");
			element.setValue("");
			element.setLabel("发动机号");

			Condition condition = new Condition();
			condition.setAllowEmpty("false");
			condition.setChecked("");
			condition.setDisPlay("true");
			condition.setMaxLength("20");
			condition.setReadOnly("");
			condition.setUpper("");
			element.setCondition(condition);

			tb.add(element);
		}
		{
			Element element = new Element();
			element.setId("ShowEnrollDate");
			element.setPage("1");
			element.setType("textbox");
			element.setValue("2013/03/05");
			element.setGroup("qbrq");
			element.setLabel("初登日期");
			
			Condition condition = new Condition();
			condition.setAllowEmpty("false");
			condition.setChecked("");
			condition.setDisPlay("true");
			condition.setMaxLength("20");
			condition.setReadOnly("");
			condition.setUpper("");
			Date date=new Date();
			date.setIsDate("true");
			date.setDateFormat("yyyy/MM/dd");
			date.setMinDate("2013/03/03");
			condition.setDate(date);
			
			element.setCondition(condition);//VEHICLE_MODELSH

			tb.add(element);
		}
		{
			Element element = new Element();
			element.setId("VEHICLE_MODELSH");
			element.setPage("1");
			element.setType("textbox");
			element.setValue("");
			element.setGroup("");
			element.setLabel("品牌型号");
			
			Condition condition = new Condition();
			condition.setAllowEmpty("false");
			condition.setChecked("");
			condition.setDisPlay("true");
			condition.setMaxLength("20");
			condition.setReadOnly("");
			condition.setUpper("");
			
			element.setCondition(condition);

			tb.add(element);
		}
		{
			Element element = new Element();
			element.setId("StartDateSY");
			element.setPage("1");
			element.setType("textbox");
			element.setValue("2013/03/05");
			element.setGroup("qbrq");
			element.setLabel("初登日期");
			
			Condition condition = new Condition();
			condition.setAllowEmpty("false");
			condition.setChecked("");
			condition.setDisPlay("true");
			condition.setMaxLength("20");
			condition.setReadOnly("");
			condition.setUpper("");
			
			Date date=new Date();
			date.setIsDate("true");
			date.setDateFormat("yyyy/MM/dd");
			date.setMinDate("2013/03/03");
			date.setHaveSubHour("true");
			date.setSubHourId("StartHourSY");
			condition.setDate(date);
			Event event=new Event();
			event.setAction("change");
			SubEvent subEvent=new SubEvent();
			subEvent.setTargetIds("enddateSY_DS");
			subEvent.setTargetAttr("value");
			subEvent.setTargetVal("@enddateSY_DS@d+1Y");//i为数字加 
			element.setCondition(condition);
			event.add(subEvent);
			condition.addEvent(event);
			tb.add(element);
		}
		{
			Element element = new Element();
			element.setId("enddateSY_DS");
			element.setPage("1");
			element.setType("label");
			element.setValue("2014/03/05");
			element.setGroup("qbrq");

			tb.add(element);
		}
		{
			Element element = new Element();
			element.setId("StartHourSY");
			element.setPage("1");
			element.setType("select");
			element.setValue("16-24");
			element.setGroup("qbrq");
			Condition condition=new Condition();
			//condition.setMinDate("4");

			tb.add(element);
		}
		{
			Element element = new Element();
			element.setId("haveLoan");
			element.setPage("1");
			element.setType("radio");
			element.setValue("1");
			element.setGroup("sfdk");
			element.setLabel("是否贷款车");
			
			Condition condition = new Condition();
			condition.setAllowEmpty("false");
			condition.setChecked("");
			condition.setDisPlay("true");
			condition.setMaxLength("20");
			condition.setReadOnly("");
			condition.setUpper("");
			Event event=new Event();
			event.setAction("checked");
			SubEvent subEvent=new SubEvent();
			subEvent.setTargetIds("LoanNameId");
			subEvent.setTargetAttr("display");
			subEvent.setTargetVal("true");
			element.setCondition(condition);
			event.add(subEvent);
			condition.addEvent(event);
			
			tb.add(element);
		}
		{
			Element element = new Element();
			element.setId("haveLoan");
			element.setPage("1");
			element.setType("radio");
			element.setValue("2");
			element.setGroup("sfdk");
			element.setLabel("是否贷款车");
			
			Condition condition = new Condition();
			condition.setAllowEmpty("");
			condition.setChecked("");
			condition.setDisPlay("");
			condition.setMaxLength("");
			condition.setReadOnly("");
			condition.setUpper("");
			element.setCondition(condition);
			Event event=new Event();
			event.setAction("checked");
			SubEvent subEvent=new SubEvent();
			subEvent.setTargetIds("LoanNameId");
			subEvent.setTargetAttr("display");
			subEvent.setTargetVal("false");
			element.setCondition(condition);
			event.add(subEvent);
			condition.addEvent(event);
			

			tb.add(element);
		}
		{
			Element element = new Element();
			element.setId("LoanNameId");
			element.setPage("1");
			element.setType("textbox");
			element.setValue("");
			element.setGroup("");
			element.setLabel("贷款机构名称");
			
			Condition condition = new Condition();
			condition.setAllowEmpty("");
			condition.setChecked("");
			condition.setDisPlay("false");
			condition.setMaxLength("20");
			condition.setReadOnly("");
			condition.setUpper("");
			
			element.setCondition(condition);

			tb.add(element);
		}
		tb.setElementNum(tb.getElements().size()+"");
		return tb;
	}

}
