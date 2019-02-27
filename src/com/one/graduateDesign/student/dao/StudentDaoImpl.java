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
	
	/*
	 * 按学号查找学生身份
	 */
	public Student judge(String studentId) {
		String hql = "from Student where studentId = ? ";
		Query q = this.sessionFactory.getCurrentSession().createQuery(hql);
		q.setParameter(0, studentId);
		Student s = (Student)q.uniqueResult();
		return s;
	}
	
	/*
	 * 学生->课题->老师->通知
	 */
	public Inform findNoticeByStudent(String stuId) {
		String hql = "from Student where studentId = ? ";
		Query q = this.sessionFactory.getCurrentSession().createQuery(hql);
		q.setParameter(0, stuId);
		Student s = (Student)q.uniqueResult();
		Inform inform = null;
		if(s.getProject() != null) {
			Teacher t = s.getProject().getTeacher();
			if(t != null) {
				inform = t.getInform();
			}
			else {
				return inform;
			}
		}
		else {
			return inform;
		}
		return inform;
	}

}
