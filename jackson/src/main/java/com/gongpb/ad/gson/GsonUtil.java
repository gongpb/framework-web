package com.gongpb.ad.gson;

import com.gongpb.ad.vo.AdVo;
import com.gongpb.gson.strategy.AdExclusionStrategy;
import com.gongpb.jsonlib.bean.AddressJsonLib;
import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonUtil {
	public final static Gson gson = new GsonBuilder()
			.excludeFieldsWithoutExposeAnnotation() // <---
			.create();

	private static String[] filedArray = {"skip","seed"};
	private static AdExclusionStrategy adExclusionStrategy = new AdExclusionStrategy(AdVo.class, filedArray);

	public final static Gson gsonStrategy = new GsonBuilder()
			.setExclusionStrategies(adExclusionStrategy)
			.create();
}
