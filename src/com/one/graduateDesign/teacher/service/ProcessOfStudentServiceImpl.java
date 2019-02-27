package com.one.graduateDesign.teacher.service;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.one.graduateDesign.entity.Project;
import com.one.graduateDesign.entity.Student;
import com.one.graduateDesign.entity.Teacher;

@Service
@Transactional(readOnly = false)
public class ProcessOfStudentServiceImpl {
	public Map<String, Student> process(Teacher t) {
		Map<String, Student> map = new HashMap();
		Set<Project> set = new HashSet();
		set = t.getProject();
		for (Project object : set) {
			for (Student stu : object.getStudent()) {
				map.put(object.getName(), stu);
			}
		}
		return map;
	}
}
