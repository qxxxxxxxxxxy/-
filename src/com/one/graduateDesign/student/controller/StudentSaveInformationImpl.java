package com.one.graduateDesign.student.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.one.graduateDesign.entity.Information;
import com.one.graduateDesign.entity.Student;
import com.one.graduateDesign.student.service.StudentServiceImpl;

@Controller
public class StudentSaveInformationImpl {
	
	@Resource
	private StudentServiceImpl studentServiceImpl;
	
	@RequestMapping(value = "information")
	public void studentSave(HttpSession session,HttpServletRequest request,HttpServletResponse response) throws IOException {
		Student s = (Student)session.getAttribute("stu");
		Information information = new Information();
		information.setContents("已经查看最新通知");
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		information.setDate(df.format(new Date()));
		information.setStuId(s.getStudentId());
		information.settId(s.getProject().getTeacher().getTeacherId());
		information.setName(s.getName());
		String stuId = s.getStudentId();
		Boolean a = this.studentServiceImpl.stuInfor(information,stuId);
		response.sendRedirect("/graduateDesign/student/indexOfStudent.jsp");
	}
}
