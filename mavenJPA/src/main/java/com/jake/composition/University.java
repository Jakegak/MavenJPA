package com.jake.composition;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class University {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="uni_id")
	private int universityId;
	
	@Column(name="uni_name")
	private String universityName;
	
	@OneToMany(mappedBy="university")
	private List<Student> student;
	
	
	public University() {
		this.student = new ArrayList<>();
	}


	public University(String universityName) {
		this();
		this.universityName = universityName;
	}


	public int getUniversityId() {
		return universityId;
	}


	public void setUniversityId(int universityId) {
		this.universityId = universityId;
	}


	public String getUniversityName() {
		return universityName;
	}


	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}


	public List<Student> getStudent() {
		return student;
	}


	public void setStudent(List<Student> student) {
		this.student = student;
	}
	
	public void addStudent(Student student){
		this.student.add(student);
	}
	
	
}
