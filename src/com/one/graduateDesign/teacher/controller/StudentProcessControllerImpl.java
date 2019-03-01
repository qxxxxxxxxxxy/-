package com.one.graduateDesign.teacher.controller;

import java.io.IOException;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.one.graduateDesign.entity.Student;
import com.one.graduateDesign.entity.Teacher;
import com.one.graduateDesign.teacher.service.StudentProcessServiceImpl;

@Controller
public class StudentProcessControllerImpl {
	@Resource
	private StudentProcessServiceImpl studentProcessServiceImpl;
	@RequestMapping(value="processs")
	public void findProcess(HttpSession session,HttpServletResponse response) throws IOException {
		Teacher t = (Teacher)session.getAttribute("teacher");
		Map <Student,String> map = this.studentProcessServiceImpl.findProcess(t);
		session.setAttribute("Maap", map);
		response.sendRedirect("/graduateDesign/teacher/procControl.jsp");
	}
}
