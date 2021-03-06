package com.jake.inheritance;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Cars")
public class Car extends Vehicle {

	public int speed;

	public Car() {

	}

	public Car(String name, int speed) {
		super(name);
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

}
