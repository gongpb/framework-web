package com.gongpb.framework.exception.base.handler;

import com.gongpb.framework.exception.dto.Response;

public interface ExceptionHandler {
	Object handleException(String errorCode, Exception bex, Response response);
}
