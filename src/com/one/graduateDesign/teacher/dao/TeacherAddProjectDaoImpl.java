package com.one.graduateDesign.teacher.dao;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.one.graduateDesign.entity.Project;
import com.one.graduateDesign.entity.Teacher;

@Repository
public class TeacherAddProjectDaoImpl {

	@Resource
	private SessionFactory sessionFactory;
	
	public void teacherAddProject(Project p) {
		this.sessionFactory.getCurrentSession().save(p);
	}
	
}
