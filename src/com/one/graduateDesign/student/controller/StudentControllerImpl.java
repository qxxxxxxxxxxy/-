package com.one.graduateDesign.student.controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.one.graduateDesign.entity.Inform;
import com.one.graduateDesign.entity.Student;
import com.one.graduateDesign.entity.Teacher;
import com.one.graduateDesign.student.service.StudentServiceImpl;

@Controller
@RequestMapping(value = "student")
public class StudentControllerImpl {

	@Resource
	private StudentServiceImpl studentServiceImpl; 
	
	@RequestMapping(value = "/login",method=RequestMethod.POST)
	public void studentLogin(@RequestParam("studentId") String studentId ,@RequestParam("password") String passWord,
			Model model,HttpSession session,HttpServletRequest request,HttpServletResponse response) throws IOException {
		Student s = studentServiceImpl.studentLogin(studentId, passWord);
		if(s != null) {
			session.setAttribute("stu", s);
			response.sendRedirect("/graduateDesign/student/indexOfStudent.jsp");
		}
		else {
			//model.addAttribute("NameOrPwdError", "用户名或密码错误！");
			response.sendRedirect("/graduateDesign/index.jsp");
		}
	}
}
