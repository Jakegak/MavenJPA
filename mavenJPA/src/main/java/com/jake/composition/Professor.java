package com.jake.composition;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Professor {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="professor_id")
	private int professorId;
	
	@Column(name="professor_name")
	private String professorName;
	
	@ManyToMany(mappedBy=("professor"))
	private List<ReasearchProject> research;
	
	public Professor() {
		this.research = new ArrayList<>();
	}

	public Professor(String professorName) {
		this();
		this.professorName = professorName;
	}

	public int getProfessorId() {
		return professorId;
	}

	public void setProfessorId(int professorId) {
		this.professorId = professorId;
	}

	public String getProfessorName() {
		return professorName;
	}

	public void setProfessorName(String professorName) {
		this.professorName = professorName;
	}

	public List<ReasearchProject> getResearch() {
		return research;
	}

	public void setResearch(List<ReasearchProject> research) {
		this.research = research;
	}
	
	public void assignProjectToProfessor(ReasearchProject research){
		this.research.add(research);
	}
	
}
