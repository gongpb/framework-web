package com.gongpb.fastjson.util;

import java.util.HashSet;
import java.util.Set;

import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.PropertyPreFilter;

public class ExcliudeSimplePropertyPreFilter implements PropertyPreFilter{
    private final Class<?>    clazz;
    private final Set<String> includes = new HashSet<String>();
    private final Set<String> excludes = new HashSet<String>();

    public ExcliudeSimplePropertyPreFilter(boolean flag, String... properties){
        this(null, flag, properties);
    }

    public ExcliudeSimplePropertyPreFilter(Class<?> clazz, boolean flag, String... properties){
        super();
        this.clazz = clazz;
        if(flag){
        	for (String item : properties) {
        		if (item != null) {
        			this.includes.add(item);
        		}
        	}
        } else {
        	for (String item : properties) {
        		if (item != null) {
        			this.excludes.add(item);
        		}
        	}
        }
    }

    public Class<?> getClazz() {
        return clazz;
    }

    public Set<String> getIncludes() {
        return includes;
    }

    public Set<String> getExcludes() {
        return excludes;
    }
    public void setExcludes(String... properties){
    	 for (String item : properties) {
    		 this.excludes.add(item);
    	 }
    }

    public boolean apply(JSONSerializer serializer, Object source, String name) {
        if (source == null) {
            return true;
        }

        if (clazz != null && !clazz.isInstance(source)) {
            return true;
        }

        if (this.excludes.contains(name)) {
            return false;
        }

        if (includes.size() == 0 || includes.contains(name)) {
            return true;
        }

        return false;
    }
}
