package com.one.graduateDesign.teacher.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.one.graduateDesign.entity.Teacher;
import com.one.graduateDesign.teacher.dao.TeacherLoginDaoImpl;

@Service
@Transactional(readOnly=false)
public class TeacherLoginServiceImpl {
	@Resource
	private TeacherLoginDaoImpl teacherLoginDaoImpl;
	
	public Teacher teacherLogin(String id, String passWord) {
		Teacher teacher = teacherLoginDaoImpl.findByTeacherId(id);
//		System.out.println(teacher.getName());
		if(teacher.getPassword().equals(passWord)) {
			return teacher;
		}
		else {
			return null;
		}
	}
}
