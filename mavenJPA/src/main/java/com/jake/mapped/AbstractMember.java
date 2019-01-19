package com.jake.mapped;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class AbstractMember {
	protected String location;


	public AbstractMember() {
		
	}
	
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
