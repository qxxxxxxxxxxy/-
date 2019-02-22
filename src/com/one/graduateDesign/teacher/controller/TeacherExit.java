package com.one.graduateDesign.teacher.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class TeacherExit {
	@RequestMapping(value = "teacherExit")
	public void teacherExit(HttpServletRequest request,HttpServletResponse response) throws IOException {
		request.removeAttribute("teacher");
		response.sendRedirect("/graduateDesign/index.jsp");
	}
}
