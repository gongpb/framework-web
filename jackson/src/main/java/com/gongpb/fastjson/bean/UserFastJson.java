package com.gongpb.fastjson.bean;

import com.alibaba.fastjson.annotation.JSONField;

public class UserFastJson {
	@JSONField(name="ID")
	private int id;
	@JSONField(name="NAME")
    private String name;
	@JSONField(name="EMAIL")
    private String email;
	@JSONField(name="BIRTHDAY")
    private String birthday;
	@JSONField(name="ADDRESS")
    private AdressFastJson address;
    
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

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public AdressFastJson getAddress() {
		return address;
	}

	public void setAddress(AdressFastJson address) {
		this.address = address;
	}


}
