package com.one.graduateDesign.project.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.one.graduateDesign.entity.Teacher;
import com.one.graduateDesign.teacher.dao.TeacherLoginDaoImpl;

@Service
@Transactional(readOnly=false)
public class FindByTeacherIdServiceImpl {

	@Resource
	private TeacherLoginDaoImpl teacherLoginDaoImpl;
	
	public Teacher find(String id) {
		return this.teacherLoginDaoImpl.findByTeacherId(id);
	}
}
