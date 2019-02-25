package com.one.graduateDesign.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="TEACHER")
public class Teacher {
	private Integer Id;
	private String teacherId;
	private String name;
	private String password;
	private Set<Project>project = new HashSet<Project>();
	private Inform inform;
	
	@Id
	@GeneratedValue(generator="a")
	@GenericGenerator(name="a",strategy="identity")
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@OneToMany(mappedBy="teacher",targetEntity=Project.class,cascade=CascadeType.MERGE,fetch=FetchType.EAGER)
	public Set<Project> getProject() {
		return project;
	}
	public void setProject(Set<Project> project) {
		this.project = project;
	}
	@OneToOne(mappedBy="teacher",targetEntity=Inform.class,cascade=CascadeType.MERGE,fetch=FetchType.EAGER)
	public Inform getInform() {
		return inform;
	}
	public void setInform(Inform inform) {
		this.inform = inform;
	}
	
	
}
