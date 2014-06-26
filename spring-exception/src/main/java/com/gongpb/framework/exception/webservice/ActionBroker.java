package com.gongpb.framework.exception.webservice;

import com.gongpb.framework.exception.dto.Request;
import com.gongpb.framework.exception.dto.Response;

public interface ActionBroker {

	void execute(String actionName, Request request, Response response);

}
