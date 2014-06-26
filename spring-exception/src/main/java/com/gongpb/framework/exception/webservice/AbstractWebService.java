package com.gongpb.framework.exception.webservice;

import com.gongpb.framework.exception.dto.Request;
import com.gongpb.framework.exception.dto.Response;

public class AbstractWebService {
    private ActionBroker broker;

    protected <OUT extends Response, IN extends Request> OUT execute(String actionName, IN request, OUT response) {
        broker.execute(actionName, request, response);
        return response;
    }

}
