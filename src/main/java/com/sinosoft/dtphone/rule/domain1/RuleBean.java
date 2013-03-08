package com.sinosoft.dtphone.rule.domain1;

import java.util.ArrayList;
import java.util.List;

public class RuleBean {
	String status="";//状态
	String errorCode="";//错误代码
	String errorMsg="";//错误信息
	List<Page> pages=new ArrayList<Page>();
	public void add(Page page){
		this.pages.add(page);
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
	public List<Page> getPages() {
		return pages;
	}
	public void setPages(List<Page> pages) {
		this.pages = pages;
	}
}
