package com.one.graduateDesign.student.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class FindAllCourseDaoImpl {
	@Resource
	private  SessionFactory sessionFactory;
	
	public List findAll() {
		return this.sessionFactory.getCurrentSession().createQuery("from Project").setCacheable(true).list();
	}
}
