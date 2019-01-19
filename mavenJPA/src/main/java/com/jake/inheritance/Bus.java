package com.jake.inheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(referencedColumnName="id")
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
