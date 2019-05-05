package com.one.graduateDesign.teacher.controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.one.graduateDesign.entity.Teacher;
import com.one.graduateDesign.teacher.service.ModifyInformServiceImpl;
import com.one.graduateDesign.teacher.service.TeacherProcessServiceImpl;

@Controller
public class UpdateInformControllerImpl {
	@Resource
	private ModifyInformServiceImpl modifyInformServiceImpl;
	@Resource
	private TeacherProcessServiceImpl teacherProcessServiceImpl;
	@RequestMapping(value="modify")
	public void modify(@RequestParam String theme,@RequestParam String teacherName, @RequestParam String content,
			HttpServletRequest request ,HttpServletResponse response,HttpSession session) throws IOException {
		this.modifyInformServiceImpl.updateInform(teacherName, content, theme);
		Teacher teacher = (Teacher)session.getAttribute("teacher");
		int tId = teacher.getId();
		this.teacherProcessServiceImpl.acb(tId);
		response.sendRedirect("/graduateDesign/teacher/indexOfTeacher.jsp");
	}
}
