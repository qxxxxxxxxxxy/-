package com.one.graduateDesign.teacher.dao;

import javax.annotation.Resource;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.one.graduateDesign.entity.Teacher;

@Repository
public class TeacherLoginDaoImpl {
	@Resource
	private SessionFactory sessionFactory;
	
	public Teacher findByTeacherId(String id) {
		Query query = this.sessionFactory.getCurrentSession().createQuery("from Teacher where teacherId='"+id+"'");
		Teacher tea = null;
		tea = (Teacher)query.uniqueResult();
//		System.out.println(tea.getName());
		return tea;
	}
}
