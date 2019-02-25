package com.one.graduateDesign.teacher.controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.one.graduateDesign.teacher.service.ModifyInformServiceImpl;

@Controller
public class UpdateInformControllerImpl {
	@Resource
	private ModifyInformServiceImpl modifyInformServiceImpl;
	
	@RequestMapping(value="modify")
	public void modify(@RequestParam String theme,@RequestParam String teacherName, @RequestParam String content,
			HttpServletRequest request ,HttpServletResponse response) throws IOException {
		this.modifyInformServiceImpl.updateInform(teacherName, content, theme);
		response.sendRedirect("/graduateDesign/teacher/indexOfTeacher.jsp");
	}
}
