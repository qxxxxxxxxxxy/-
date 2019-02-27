package com.one.graduateDesign.student.dao;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.one.graduateDesign.entity.Inform;
import com.one.graduateDesign.entity.Student;
import com.one.graduateDesign.entity.Teacher;

@Repository
public class StudentDaoImpl {
	@Resource
	private SessionFactory sessionFactory;
	
	public Student judge(String studentId) {
		String hql = "from Student where studentId = ? ";
		Query q = this.sessionFactory.getCurrentSession().createQuery(hql);
		q.setParameter(0, studentId);
		Student s = (Student)q.uniqueResult();
		return s;
	}

}
