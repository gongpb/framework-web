package com.gongpb.framework.mvc.view;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import com.gongpb.framework.mvc.controller.IndexController;

public class DevViewResolver implements ViewResolver   {
	private static Logger logger = LoggerFactory.getLogger(IndexController.class);
	
    private Map<Set<String>,ViewResolver> viewResolverMap = new HashMap<Set<String>,ViewResolver>();
    private ViewResolver defaultViewResolver = null;
    
	public View resolveViewName(String viewName, Locale locale) throws Exception {
	       for(Map.Entry<Set<String>, ViewResolver> map : viewResolverMap.entrySet()){
	           Set<String> suffixs = map.getKey();
	           for(String suffix : suffixs){
	               if (viewName.endsWith(suffix)){
	                   ViewResolver viewResolver = map.getValue();
	                   if(null != viewResolver){
	                       if (logger.isDebugEnabled()) {
	                            logger.debug("found viewResolver '" + viewResolver + "' for viewName '" + viewName+ "'");
	                        }
	                       return viewResolver.resolveViewName(viewName, locale);
	                   }
	               }
	           }
	       }
	       
	       if(defaultViewResolver != null){
	           return defaultViewResolver.resolveViewName(viewName, locale);
	       }
	       // to allow for ViewResolver chaining
	       return null;
	    }

	    public Map<Set<String>, ViewResolver> getViewResolverMap() {
	        return viewResolverMap;
	    }

	    public void setViewResolverMap(Map<Set<String>, ViewResolver> viewResolverMap) {
	        this.viewResolverMap = viewResolverMap;
	    }

	    public ViewResolver getDefaultViewResolver() {
	        return defaultViewResolver;
	    }

	    public void setDefaultViewResolver(ViewResolver defaultViewResolver) {
	        this.defaultViewResolver = defaultViewResolver;
	    }

}