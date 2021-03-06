package com.gongpb.jackson.bean;

import org.codehaus.jackson.annotate.JsonProperty;

public class UserJackJson {
	@JsonProperty("ID")
	private int id;
	@JsonProperty("NAME")
    private String name;
	@JsonProperty("EMAIL")
    private String email;
	@JsonProperty("ADDRESS")
    private AddressJackJson address;
	@JsonProperty("BIRTHDAY")
    private String birthday;
    
    //getter、setter
    
    @Override
    public String toString() {
        return this.name + "#" + this.id + "#" + this.address + "#" + this.birthday + "#" + this.email;
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

	public AddressJackJson getAddress() {
		return address;
	}

	public void setAddress(AddressJackJson address) {
		this.address = address;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	

}
