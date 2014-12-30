package com.gongpb.fastjson.bean;

import com.alibaba.fastjson.annotation.JSONField;

public class AdressFastJson {
	@JSONField(name="ID")
	private Integer id;
	@JSONField(name="POSTCODE")
	private String postCode; //属相
	@JSONField(name="CITY")
	private String city;
	@JSONField(name="PROVINCE")
	private String province;

	public AdressFastJson() {
	}

	@Override
	public String toString() {
		return this.postCode;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

}
