package com.one.graduateDesign.project.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.one.graduateDesign.entity.Project;
import com.one.graduateDesign.entity.Teacher;
import com.one.graduateDesign.project.dao.DeleteProjectDaoImpl;
import com.one.graduateDesign.project.dao.FindProjectDaoImpl;
import com.one.graduateDesign.teacher.dao.TeacherLoginDaoImpl;

@Service
@Transactional(readOnly=false)
public class DeleteProjectServiceImpl {
	
	@Resource
	private DeleteProjectDaoImpl deleteProjectDaoImpl;
	@Resource
	private FindProjectDaoImpl findProjectDaoImpl;
	@Resource
    private TeacherLoginDaoImpl teacherLoginDaoImpl;
	
	public Project DeleteProjectService(String name) {
		Project p = this.findProjectDaoImpl.FindProjectByName(name);
		this.deleteProjectDaoImpl.deleteProjectByName(p);
		return p;
	}
}
