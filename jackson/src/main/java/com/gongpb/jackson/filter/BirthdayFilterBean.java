package com.gongpb.jackson.filter;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonFilter;

@JsonFilter("BirthdayFilter")
public class BirthdayFilterBean {
	@JsonProperty("ID")
	private Integer id;
	@JsonProperty("ZODIAC")
	private String zodiac; //属相
	@JsonProperty("BIRTHDAY")
	private String birthday;

	public BirthdayFilterBean(String birthday) {
		this.birthday = birthday;
	}

	// getter、setter

	public BirthdayFilterBean() {
	}

	@Override
	public String toString() {
		return this.birthday;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getZodiac() {
		return zodiac;
	}

	public void setZodiac(String zodiac) {
		this.zodiac = zodiac;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

}
