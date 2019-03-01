package com.one.graduateDesign.teacher.dao;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.one.graduateDesign.entity.Student;

@Repository
public class ChooseStudentDaoImpl {
	@Resource
	private SessionFactory sessionFactory;
	
	public void updateStu(Student student) {
		this.sessionFactory.getCurrentSession().saveOrUpdate(student);
	}
}
