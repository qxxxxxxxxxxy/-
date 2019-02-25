package com.one.graduateDesign.teacher.dao;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.one.graduateDesign.entity.Inform;

@Repository
public class UpdateInformDaoImpl {
	@Resource
	private SessionFactory sessionFactory;
	
	public void updateInform(Inform inform) {
		this.sessionFactory.getCurrentSession().update(inform);
	}
}
