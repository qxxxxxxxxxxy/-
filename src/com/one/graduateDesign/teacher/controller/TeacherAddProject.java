package com.one.graduateDesign.teacher.controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.imageio.IIOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.one.graduateDesign.entity.Project;
import com.one.graduateDesign.entity.Teacher;
import com.one.graduateDesign.teacher.service.TeacherAddProjectServiceImpl;

@Controller
public class TeacherAddProject {

	@Resource
	private TeacherAddProjectServiceImpl teacherAddProjectServiceImpl;
	@RequestMapping(value = "teacherAddProject")
	public void TeacherAddProject(@RequestParam String projectName,
			Model model,HttpServletRequest request,HttpServletResponse response) throws IOException {
		Teacher teacher = (Teacher)request.getSession().getAttribute("teacher");
		Project p = new Project();
		p.setName(projectName);
		teacher.getProject().add(p);
		p.setTeacher(teacher);
		p.setTotalNumber(0);
		this.teacherAddProjectServiceImpl.teacherAddProject(p);
		response.sendRedirect("/graduateDesign/teacher/indexOfTeacher.jsp");
	}
}
