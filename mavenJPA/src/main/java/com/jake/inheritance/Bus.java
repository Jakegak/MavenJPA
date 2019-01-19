package com.jake.inheritance;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Buses")
public class Bus extends Vehicle {

	public int numberOfPassangers;

	public Bus() {

	}

	public Bus(String name, int numberOfPassangers) {
		super(name);
		this.numberOfPassangers = numberOfPassangers;
	}

	public int getNumberOfPassangers() {
		return numberOfPassangers;
	}

	public void setNumberOfPassangers(int numberOfPassangers) {
		this.numberOfPassangers = numberOfPassangers;
	}

}
