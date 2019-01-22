package com.jake.composition;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class ReasearchProject {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="project_id")
	private int projectId;
	
	@Column(name="project_name")
	private String projectName;
	
	@ManyToMany
	@JoinTable(name="PROF_PROJECT", 
	joinColumns = @JoinColumn(name="projectId"),
	inverseJoinColumns = @JoinColumn(name="professorId"))
	private List<Professor> professor;
	
	public ReasearchProject() {
		this.professor = new ArrayList<>();
	}

	public ReasearchProject(String projectName) {
		this();
		this.projectName = projectName;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public List<Professor> getProfessor() {
		return professor;
	}
	

	public void setProfessor(List<Professor> professor) {
		this.professor = professor;
	}
	
	public void assignProfessorToProject(Professor professor){
		this.professor.add(professor);
	}
}
