package com.gongpb.jackson2x.bean;

import org.codehaus.jackson.annotate.JsonProperty;

public class AddressJackJson2x {
	@JsonProperty("ID")
	private Integer id;
	@JsonProperty("POSTCODE")
	private String postCode; //属相
	@JsonProperty("CITY")
	private String city;
	@JsonProperty("PROVINCE")
	private String province;

	// getter、setter

	public AddressJackJson2x() {
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
