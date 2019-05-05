package com.one.graduateDesign.student.dao;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.one.graduateDesign.entity.Inform;
import com.one.graduateDesign.entity.Information;
import com.one.graduateDesign.entity.Project;
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
		Query q = this.sessionFactory.getCurrentSession().createQuery(hql).setCacheable(true);
		q.setParameter(0, studentId);
		Student s = (Student)q.uniqueResult();
		return s;
	}
	
	/*
	 * 学生->课题->老师->通知
	 */
	public Inform findNoticeByStudent(String stuId) {
		String hql = "from Student where studentId = ? ";
		Query q = this.sessionFactory.getCurrentSession().createQuery(hql).setCacheable(true);
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
	
	public List findAllStudent() {
		Session session = this.sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Student").setCacheable(true);
		ArrayList list = (ArrayList) query.list();
		return list;
	}
	/*找到学生*/
    public Student findStudent(String stuId) {
    	String hql = "from Student where studentId = ? ";
		Query q = this.sessionFactory.getCurrentSession().createQuery(hql).setCacheable(true);
		q.setParameter(0, stuId);
		Student s = (Student)q.uniqueResult();
    	return s;
    }
    
    /*查找学生所选课题*/
    public Project findProjectByStudentId(String stuId) {
    	String hql = "from Student where studentId = ? ";
		Query q = this.sessionFactory.getCurrentSession().createQuery(hql).setCacheable(true);
		q.setParameter(0, stuId);
		Student s = (Student)q.uniqueResult();
		Project proj = s.getProject();
		return proj;
    }
    
    /*学生进度更新*/
    public Student stuProcess(String stuId,String proc) {
    	String hql = "from Student where studentId = ? ";
		Query q = this.sessionFactory.getCurrentSession().createQuery(hql).setCacheable(true);
		q.setParameter(0, stuId);
		Student s = (Student)q.uniqueResult();
		s.setProcess(proc);
		this.sessionFactory.getCurrentSession().update(s);
		return s;
    }
    public Boolean stuInformation(Information information ,String stuId) {
    	String hql = "from Information where stuId = ?";
    	Query q = this.sessionFactory.getCurrentSession().createQuery(hql).setCacheable(true);
    	q.setParameter(0, stuId);
    	if(q.uniqueResult() != null) {
    		return true;
    	}
    	else {
    		Session session = this.sessionFactory.getCurrentSession();
    		session.saveOrUpdate(information);
    		return true;
    	}
		
    }
}
