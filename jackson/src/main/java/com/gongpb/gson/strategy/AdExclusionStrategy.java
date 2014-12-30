package com.gongpb.gson.strategy;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;

public class AdExclusionStrategy implements ExclusionStrategy {
	private String[] excludeFields = {};
	private Class<?> excludedThisClass = null;
	private Class<?>[] excludeClasses = {};

	public AdExclusionStrategy(Class<?> excludedThisClass,
			String[] excludeFields) {
		this.excludedThisClass = excludedThisClass;
		this.excludeFields = excludeFields;
	}
	
	public AdExclusionStrategy( Class<?>[] excludeClasses ) {
		this.excludeClasses = excludeClasses;
	}

	@Override
	public boolean shouldSkipField(FieldAttributes field) {
		if (excludedThisClass == null || !excludedThisClass.equals(field.getDeclaringClass())) {
			return false;
		}
		for (String key : excludeFields) {
			if (key.equals(field.getName())) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean shouldSkipClass(Class<?> clazz) {
		if(excludeClasses == null){
			return false;
		}
		for(Class exClazz:excludeClasses) {
			if (exClazz.equals(clazz)) {
				return true;
			}
		}
		return false;
	}

}