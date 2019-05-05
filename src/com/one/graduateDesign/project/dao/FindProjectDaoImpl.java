package com.one.graduateDesign.project.dao;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.one.graduateDesign.entity.Project;

@Repository
public class FindProjectDaoImpl {

	@Resource
	private SessionFactory sessionFactory;
	
	public Project FindProjectByName(String name) {
		Query query = this.sessionFactory.getCurrentSession().createQuery("from Project where name='"+name+"'").setCacheable(true);
		return (Project)query.uniqueResult();
	}
}
