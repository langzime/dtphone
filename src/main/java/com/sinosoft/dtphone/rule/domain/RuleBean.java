package com.sinosoft.dtphone.rule.domain;

import java.util.ArrayList;
import java.util.List;


public class RuleBean {
	String status="";//状态
	String errorCode="";//错误代码
	String errorMsg="";//错误信息
	String elementNum="";//节点个数
	List<Element> elements=new ArrayList<Element>();
	public void add(Element element){
		this.elements.add(element);
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public String getElementNum() {
		return elementNum;
	}
	public void setElementNum(String elementNum) {
		this.elementNum = elementNum;
	}
	public List<Element> getElements() {
		return elements;
	}
	public void setElements(List<Element> elements) {
		this.elements = elements;
	}
}
