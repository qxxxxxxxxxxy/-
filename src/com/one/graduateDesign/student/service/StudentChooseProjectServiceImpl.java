package com.one.graduateDesign.student.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.one.graduateDesign.entity.Project;
import com.one.graduateDesign.entity.Student;
import com.one.graduateDesign.student.dao.FindProjectByIdDaoImpl;
import com.one.graduateDesign.student.dao.StudentChooseProjectDaoImpl;

@Service
@Transactional(readOnly=false)

public class StudentChooseProjectServiceImpl {
	@Resource
	private StudentChooseProjectDaoImpl studentChooseProjectDapImpl;
	@Resource
	private FindProjectByIdDaoImpl findProjectByIdDaoImpl;
	
	public void StudentChooseProject(String id,Student stu) {
		int a = Integer.parseInt(id);
		Project p = this.findProjectByIdDaoImpl.findProjectById(a);
		p.setTotalNumber((p.getTotalNumber() + 1));
	    stu.setProject(p);
	    stu.setStatus("1");
	    this.studentChooseProjectDapImpl.update(p, stu);
	}
}
