package com.gongpb.framework.exception.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.gongpb.framework.exception.annotation.Exceptional;
import com.gongpb.framework.exception.base.BaseAppException;
import com.gongpb.framework.exception.base.BaseAppRuntimeException;
import com.gongpb.framework.exception.config.ExceptionDefinition;
import com.gongpb.framework.exception.context.CoreContextFactory;
import com.gongpb.framework.exception.context.ExceptionContext;

public class ExceptionalAnnotationBeanPostProcessor implements BeanPostProcessor {

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
       if(bean instanceof BaseAppRuntimeException || bean instanceof BaseAppException) {
           Exceptional exceptional = bean.getClass().getAnnotation(Exceptional.class);
           if(null != exceptional) {
               ExceptionContext ctx = CoreContextFactory.getInstance().getExceptionContext();
               if(!ctx.containsException(bean.getClass())) {
                   ExceptionDefinition expDefinition = new ExceptionDefinition(exceptional.errorCode());
                   ctx.setExceptionDefinition(bean.getClass(), expDefinition);
               }
               ctx.addExceptionHandlers(bean.getClass(), exceptional.handlers());
               return null;
           }
       }
       return bean;
    }

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
            return bean;
    }

}
