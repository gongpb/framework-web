package com.gongpb.jackson.filter;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonFilter;

@JsonFilter("UserFilter")  
public class UserFilterBean {
	@JsonProperty("ID")
	private int id;
	@JsonProperty("NAME")
    private String name;
	@JsonProperty("EMAIL")
    private String email;
	@JsonProperty("ADDRESS")
    private String address;
	@JsonProperty("BIRTHDAY")
    private BirthdayFilterBean birthday;
    
    //getter、setter
    
    @Override
    public String toString() {
        return this.name + "#" + this.id + "#" + this.address + "#" + this.birthday + "#" + this.email +"#"+birthday.toString();
    }
    
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public BirthdayFilterBean getBirthday() {
		return birthday;
	}

	public void setBirthday(BirthdayFilterBean birthday) {
		this.birthday = birthday;
	}

}
