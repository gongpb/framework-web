package com.gongpb.jackson.PropertyNamingStrategy;

import org.codehaus.jackson.map.PropertyNamingStrategy.PropertyNamingStrategyBase;

public class MyPropertyNamingStrategy extends PropertyNamingStrategyBase{

	@Override
	public String translate(String propertyName) {
		return propertyName.toUpperCase();
	}

}
