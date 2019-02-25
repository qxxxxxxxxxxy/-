package com.one.graduateDesign.teacher.dao;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.one.graduateDesign.entity.Inform;
import com.one.graduateDesign.entity.Teacher;

@Repository
public class FindInformByTeacherIdImpl {

	@Resource
	private SessionFactory sessionFactory;
	
	public Inform findByTeacherId(String id) {
		Query query = this.sessionFactory.getCurrentSession().createQuery("from Teacher where teacherId=?");
		query.setParameter(0, id);
//		query.executeUpdate();
		Teacher teacher = (Teacher)query.uniqueResult();
		return teacher.getInform();
	}
}
