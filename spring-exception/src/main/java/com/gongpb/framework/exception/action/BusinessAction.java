package com.gongpb.framework.exception.action;

import com.gongpb.framework.exception.base.BaseAppException;
import com.gongpb.framework.exception.dto.Request;
import com.gongpb.framework.exception.dto.Response;

public interface BusinessAction<OUT extends Response, IN extends Request> {

	/**
	 * 
	 * @param request
	 * @param response TODO
	 */
	void execute(IN request, OUT response) throws BaseAppException;
}
