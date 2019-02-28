package com.one.graduateDesign.student.dao;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.one.graduateDesign.entity.Project;
import com.one.graduateDesign.entity.Student;

@Repository
public class StudentChooseProjectDaoImpl {
	
	@Resource
	private  SessionFactory sessionFactory;
	
	public void update(Project p ,Student t) {
		Session session = this.sessionFactory.getCurrentSession();
		session.saveOrUpdate(p);
		session.saveOrUpdate(t);
	}
}
