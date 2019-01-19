package com.jake.mavenJPA;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@Table(name = "Person")
@NamedQueries({ @NamedQuery(name = "Person.getAll", query="SELECT p from Person p"),
		        @NamedQuery(name = "Person.getname", query="SELECT p from Person p WHERE p.name = :name")})
public class Person {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private String email;
	
	public Person() {
	}
	
	public Person(String name, String email) {
		super();
		this.name = name;
		this.email = email;
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
	
	@Override
	public String toString() {
		return this.name + " " + this.email
				;
	}
	
	
	
	
	
}
