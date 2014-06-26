package com.gongpb.framework.exception.dto;

public interface Response {
	boolean isSuccess();

	String getErrorCode();

	String getMessage();
	
	void setSuccess(boolean isSuccess);
	
	void setErrorCode(String errorCode);
	
	void setMessage(String message);
}
