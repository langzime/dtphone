package com.sinosoft.dtphone.rule.main;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sinosoft.dtphone.rule.domain1.Body;
import com.sinosoft.dtphone.rule.domain1.Condition;
import com.sinosoft.dtphone.rule.domain1.Date;
import com.sinosoft.dtphone.rule.domain1.Element;
import com.sinosoft.dtphone.rule.domain1.Event;
import com.sinosoft.dtphone.rule.domain1.Group;
import com.sinosoft.dtphone.rule.domain1.Head;
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
			e.printStackTrace();
		}
	}

	public static RuleBean getTB() {
		RuleBean rb = new RuleBean();
		Head head = new Head();
		Body body = new Body();
		rb.setHead(head);
		rb.setBody(body);
		head.setErrorCode("001");
		head.setStatus("1");
		head.setErrorMsg("返回成功");
		{
			Page page = new Page();
			page.setPageNo("1");
			{
				Group group = new Group();
				group.setGroupName("LicenseNo");
				{
					Element element = new Element();
					element.setId("LicenseNo");
					element.setType("text");
					element.setValue("");
					element.setLabel("车牌号");
					Condition conditon = new Condition();
					conditon.setAllowEmpty("false");
					conditon.setChecked("true");
					conditon.setDisPlay("true");
					conditon.setMaxLength("6");
					conditon.setReadOnly("false");
					conditon.setUpper("true");
					{
						Event event = new Event();
						event.setAction("checked");
						{
							SubEvent subEvent = new SubEvent();
							subEvent.setTargetIds("LicenseNo");
							subEvent.setTargetAttr("value");
							subEvent.setTargetVal("津*");// 相当于append
							event.add(subEvent);
						}
						conditon.addEvent(event);
					}
					element.setCondition(conditon);
					group.add(element);
				}
				page.add(group);
			}
			{
				Group group = new Group();
				group.setGroupName("");
				{
					Element element = new Element();
					element.setId("");
					element.setType("text");
					element.setValue("");
					element.setLabel("车主姓名");
					Condition conditon = new Condition();
					conditon.setAllowEmpty("false");
					conditon.setChecked("true");
					conditon.setDisPlay("true");
					conditon.setMaxLength("6");
					conditon.setReadOnly("false");
					conditon.setUpper("true");
					element.setCondition(conditon);
					group.add(element);
				}
				page.add(group);
			}
			{
				Group group = new Group();
				group.setGroupName("AppliMobile");
				{
					Element element = new Element();
					element.setId("AppliMobile");
					element.setType("text");
					element.setValue("");
					element.setLabel("电话");
					Condition conditon = new Condition();
					conditon.setAllowEmpty("false");
					conditon.setChecked("true");
					conditon.setDisPlay("true");
					conditon.setMaxLength("6");
					conditon.setReadOnly("false");
					conditon.setUpper("true");
					element.setCondition(conditon);
					group.add(element);
				}
				page.add(group);
			}
			{
				Group group = new Group();
				group.setGroupName("AppliEmail");
				{
					Element element = new Element();
					element.setId("AppliEmail");
					element.setType("text");
					element.setValue("");
					element.setLabel("电子邮箱");
					Condition conditon = new Condition();
					conditon.setAllowEmpty("false");
					conditon.setChecked("true");
					conditon.setDisPlay("true");
					conditon.setMaxLength("6");
					conditon.setReadOnly("false");
					conditon.setUpper("true");
					element.setCondition(conditon);
					group.add(element);
				}
				page.add(group);
			}
			{
				Group group = new Group();
				group.setGroupName("FrameNo");
				{
					Element element = new Element();
					element.setId("FrameNo");
					element.setType("text");
					element.setValue("");
					element.setLabel("车辆识别码/车架号");
					Condition conditon = new Condition();
					conditon.setAllowEmpty("false");
					conditon.setChecked("true");
					conditon.setDisPlay("true");
					conditon.setMaxLength("11");
					conditon.setReadOnly("false");
					conditon.setUpper("true");
					element.setCondition(conditon);
					group.add(element);
				}
				page.add(group);
			}
			{
				Group group = new Group();
				group.setGroupName("EngineNo");
				{
					Element element = new Element();
					element.setId("EngineNo");
					element.setType("text");
					element.setValue("");
					element.setLabel("发动机号");
					Condition conditon = new Condition();
					conditon.setAllowEmpty("false");
					conditon.setChecked("true");
					conditon.setDisPlay("true");
					conditon.setMaxLength("11");
					conditon.setReadOnly("false");
					conditon.setUpper("true");
					element.setCondition(conditon);
					group.add(element);
				}
				page.add(group);
			}
			{
				Group group = new Group();
				group.setGroupName("ShowEnrollDate");
				{
					Element element = new Element();
					element.setId("ShowEnrollDate");
					element.setType("text");
					element.setValue("2013/03/16");
					element.setLabel("初登日期");
					Condition conditon = new Condition();
					conditon.setAllowEmpty("false");
					conditon.setChecked("true");
					conditon.setDisPlay("true");
					conditon.setMaxLength("11");
					conditon.setReadOnly("false");
					conditon.setUpper("true");
					Date date=new Date();
					date.setIsDate("true");
					date.setDateFormat("yyyy/MM/dd");
					date.setMinDate("2012/10/16");
					date.setMaxDate("2013/03/16");
					conditon.setDate(date);
					element.setCondition(conditon);
					group.add(element);
				}
				page.add(group);
			}
			{
				Group group = new Group();
				group.setGroupName("VEHICLE_MODELSH");
				{
					Element element = new Element();
					element.setId("VEHICLE_MODELSH");
					element.setType("text");
					element.setValue("");
					element.setLabel("品牌型号");
					Condition conditon = new Condition();
					conditon.setAllowEmpty("false");
					conditon.setChecked("true");
					conditon.setDisPlay("true");
					conditon.setMaxLength("11");
					conditon.setReadOnly("false");
					conditon.setUpper("true");
					element.setCondition(conditon);
					group.add(element);
				}
				page.add(group);
			}
			{
				Group group = new Group();
				group.setGroupName("StartEndDateSY");
				{
					Element element = new Element();
					element.setId("StartDateSY");
					element.setType("text");
					element.setValue("2013/03/18");
					element.setLabel("保单生效日期");
					Condition conditon = new Condition();
					conditon.setAllowEmpty("false");
					conditon.setChecked("true");
					conditon.setDisPlay("true");
					conditon.setMaxLength("11");
					conditon.setReadOnly("false");
					conditon.setUpper("true");
					Date date=new Date();
					date.setIsDate("true");
					date.setDateFormat("yyyy/MM/dd");
					date.setMinDate("2013/03/17");
					date.setMaxDate("");
					date.setHaveSubHour("false");
					conditon.setDate(date);
					element.setCondition(conditon);
					group.add(element);
				}
				page.add(group);
			}
			body.add(page);
		}
		return rb;
	}

}
