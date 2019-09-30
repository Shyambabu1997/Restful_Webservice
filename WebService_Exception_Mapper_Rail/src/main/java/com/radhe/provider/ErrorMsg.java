package com.radhe.provider;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ErrorMsg {

	public ErrorMsg() {
		// TODO Auto-generated constructor stub
	}

	public ErrorMsg(Integer errorCode, String rootCause) {
		this.errorCode = errorCode;
		this.rootCause = rootCause;
	}

	private Integer errorCode;
	private String rootCause;

	public Integer getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}

	public String getRootCause() {
		return rootCause;
	}

	public void setRootCause(String rootCause) {
		this.rootCause = rootCause;
	}

}
