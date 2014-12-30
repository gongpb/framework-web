package com.gongpb.gson.bean;


public class AdressGson {
	private Integer id;
	private String postCode; //属相
	private String city;
	private String province;

	public AdressGson() {
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
