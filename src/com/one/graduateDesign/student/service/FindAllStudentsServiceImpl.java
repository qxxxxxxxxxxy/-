package com.one.graduateDesign.student.service;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.one.graduateDesign.entity.Student;
import com.one.graduateDesign.student.dao.StudentDaoImpl;

@Service
@Transactional(readOnly=false)
public class FindAllStudentsServiceImpl {
	
	@Resource
	private StudentDaoImpl studentDaoImpl;
	
	public Boolean findStudent(String id) {
		int a = Integer.parseInt(id);
		ArrayList<Student> list = (ArrayList) this.studentDaoImpl.findAllStudent();
		for (Student object : list) {
			if(object.getTeacherStatus().equals("1")) {
				return true;
			}
			else 
				return false;
		}
		return false;
	}
}
