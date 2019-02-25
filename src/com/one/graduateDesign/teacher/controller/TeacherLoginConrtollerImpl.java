package com.one.graduateDesign.teacher.controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.one.graduateDesign.entity.Inform;
import com.one.graduateDesign.entity.Teacher;
import com.one.graduateDesign.teacher.service.FindInformServiceImpl;
import com.one.graduateDesign.teacher.service.TeacherLoginServiceImpl;

@Controller
@RequestMapping(value = "teacher")
public class TeacherLoginConrtollerImpl {

	@Resource
	private TeacherLoginServiceImpl teacherLoginServiceImpl;
	@Resource
	private FindInformServiceImpl findInformServiceImpl;
	
	@RequestMapping(value = "login")
	public void teacherLogin(@RequestParam String teacherId ,@RequestParam String passWord,
			Model model,HttpServletRequest request,HttpServletResponse response)throws IOException {
//		System.out.println("asdf");
		Teacher teacher = this.teacherLoginServiceImpl.teacherLogin(teacherId, passWord);
		if (null != teacher) {
			Inform inform = this.findInformServiceImpl.findInform(teacherId);
			request.getSession().setAttribute("inform", inform);
			request.getSession().setAttribute("teacher", teacher);
			request.getSession().setAttribute("projectOfTeacher", teacher.getProject());
			response.sendRedirect("/graduateDesign/teacher/indexOfTeacher.jsp");
		}
		else {
			model.addAttribute("inform","用户密码错误");
			response.sendRedirect("/graduateDesign/index.jsp");
		}
		
	}
}
