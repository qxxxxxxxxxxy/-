package com.one.graduateDesign.student.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.one.graduateDesign.student.service.FindAllCourseServiceImpl;

@Controller
public class FindAllCourseControllerImpl {

	@Resource
	private FindAllCourseServiceImpl findAllCourseServiceImpl;
	@RequestMapping(value="findAll")
	public void findAllCourse(HttpSession session,HttpServletResponse response) throws IOException {
		ArrayList list = new ArrayList();
		list = (ArrayList) this.findAllCourseServiceImpl.findAll();
		session.setAttribute("list", list);
		response.sendRedirect("/graduateDesign/student/chooseCourse.jsp");
	}
}
