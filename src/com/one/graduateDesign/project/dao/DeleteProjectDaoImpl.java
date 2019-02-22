package com.one.graduateDesign.project.dao;



import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.one.graduateDesign.entity.Project;

@Repository
public class DeleteProjectDaoImpl {

	@Resource
	private SessionFactory sessionFactory;
	
	public void deleteProjectByName(Project p) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery("delete from Project where name=?");
		query.setParameter(0, p.getName());
		query.executeUpdate();
		
		tx.commit();
		session.close();
	}
}
