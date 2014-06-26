package com.gongpb.framework.exception.base;

import com.gongpb.framework.exception.annotation.Exceptional;
import com.gongpb.framework.exception.base.handler.ConsoleHandler;

@Exceptional(errorCode="LDD600-00002", handlers={ConsoleHandler.class})
public class ConfigException extends BaseAppRuntimeException {

    public ConfigException() {
        super();
    }
    
    public ConfigException(String message) {
       super(message);
    }

    public ConfigException(String message, Throwable cause) {
       super(message, cause);
    }
}
