package com.gongpb.framework.exception.test;

import com.gongpb.framework.exception.annotation.Exceptional;
import com.gongpb.framework.exception.base.BaseAppException;
import com.gongpb.framework.exception.base.handler.ConsoleHandler;

@Exceptional(errorCode="LDD600-00003", handlers={ConsoleHandler.class})
public class ExceptionFaker extends BaseAppException {

}
