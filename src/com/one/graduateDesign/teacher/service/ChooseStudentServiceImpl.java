package com.one.graduateDesign.teacher.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.one.graduateDesign.entity.Student;
import com.one.graduateDesign.student.dao.StudentDaoImpl;
import com.one.graduateDesign.teacher.dao.ChooseStudentDaoImpl;

@Service
@Transactional(readOnly=false)

public class ChooseStudentServiceImpl {
	
	@Resource
	private ChooseStudentDaoImpl chooseStudentDaoImpl;
	@Resource
	private StudentDaoImpl studentDaoImpl;
	
	public void chooseStudent(String id) {
		Student student = this.studentDaoImpl.judge(id);
		student.setTeacherStatus("1");
		this.chooseStudentDaoImpl.updateStu(student);
	}
	public void deleteS(String id) {
		Student student = this.studentDaoImpl.judge(id);
		student.setStatus("0");
		this.chooseStudentDaoImpl.updateStu(student);
	}
}
