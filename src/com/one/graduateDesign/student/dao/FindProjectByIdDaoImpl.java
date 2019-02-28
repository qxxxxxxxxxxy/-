package com.one.graduateDesign.student.dao;

import javax.annotation.Resource; 

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.one.graduateDesign.entity.Project;

@Repository
public class FindProjectByIdDaoImpl {
	@Resource
	private SessionFactory sessionFactory;

	public Project findProjectById(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Query q = session.createQuery("from Project where id = ?");
		q.setParameter(0, id);
		Project p = (Project)q.uniqueResult();
		session.clear();
		return p;
	}
}
