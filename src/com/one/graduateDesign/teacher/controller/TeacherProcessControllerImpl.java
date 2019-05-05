package com.one.graduateDesign.teacher.controller;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.one.graduateDesign.entity.Teacher;
import com.one.graduateDesign.teacher.service.TeacherProcessServiceImpl;

@Controller
public class TeacherProcessControllerImpl {

	@Resource
	private TeacherProcessServiceImpl teacherProcessServiceImpl;
	@RequestMapping(value="mod")
	public void abc(HttpServletRequest request ,HttpServletResponse response,HttpSession session) throws IOException {
		Teacher t = (Teacher)session.getAttribute("teacher");
		List list = this.teacherProcessServiceImpl.abc(t.getId());
		session.setAttribute("qxylist", list);
		response.sendRedirect("/graduateDesign/teacher/examNotice.jsp");
	}
}
