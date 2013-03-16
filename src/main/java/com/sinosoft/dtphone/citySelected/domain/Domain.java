package com.sinosoft.dtphone.citySelected.domain;

public class Domain {
	/**
	 * head节点
	 * 存放公共信息
	 */
	Head head=new Head();
	/**
	 * body节点
	 * 存放私有信息
	 */
	Body body=new Body();
	public Head getHead() {
		return head;
	}
	public void setHead(Head head) {
		this.head = head;
	}
	public Body getBody() {
		return body;
	}
	public void setBody(Body body) {
		this.body = body;
	}
}
