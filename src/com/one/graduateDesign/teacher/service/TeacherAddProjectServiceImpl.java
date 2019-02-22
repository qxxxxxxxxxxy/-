package com.one.graduateDesign.teacher.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.one.graduateDesign.entity.Project;
import com.one.graduateDesign.entity.Teacher;
import com.one.graduateDesign.teacher.dao.TeacherAddProjectDaoImpl;

@Service
@Transactional(readOnly=false)
public class TeacherAddProjectServiceImpl {

	@Resource
	private TeacherAddProjectDaoImpl teacherAddProjcetDaoImpl;
	
	public void teacherAddProject(Project p) {
		this.teacherAddProjcetDaoImpl.teacherAddProject(p);
	}
	
}
