package com.one.graduateDesign.teacher.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class TeacherPorcessDaoImpl {
	@Resource
	private SessionFactory sessionFactory;
	
	public List abc(int tId) {
		Session session = sessionFactory.getCurrentSession();
		String hql = "from Information where tId = ?";
		String a = String.valueOf(tId);
    	Query q = this.sessionFactory.getCurrentSession().createQuery(hql).setCacheable(true);
    	q.setParameter(0, a);
    	return q.list();
	}
	
	public void acd(int tId) {
		Session session = sessionFactory.getCurrentSession();
		String hql = "delete from Information where tId = ?";
		String a = String.valueOf(tId);
    	Query q = this.sessionFactory.getCurrentSession().createQuery(hql).setCacheable(true);
    	q.setParameter(0, a);
    	q.executeUpdate();
	}
}
