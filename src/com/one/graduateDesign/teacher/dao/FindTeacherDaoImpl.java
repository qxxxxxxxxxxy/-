package com.one.graduateDesign.teacher.dao;

import javax.annotation.Resource;


import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.one.graduateDesign.entity.Teacher;

@Repository
public class FindTeacherDaoImpl {
	@Resource
	private SessionFactory sessionFactory;
	
	public Teacher findByTeacherName(String name) {
		Query query = this.sessionFactory.getCurrentSession().createQuery("from Teacher where name='"+name+"'");
		Teacher teacher = (Teacher)query.uniqueResult();
		return teacher;
	}
}
