package com.one.graduateDesign.teacher.controller;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.one.graduateDesign.entity.Student;
import com.one.graduateDesign.entity.Teacher;
import com.one.graduateDesign.teacher.service.ChooseStudentServiceImpl;
import com.one.graduateDesign.teacher.service.ProcessOfStudentServiceImpl;

@Controller
public class DeleteStudentChooseControllerImpl {

	@Resource
	private ProcessOfStudentServiceImpl processOfStudentImpl;
	@Resource
	private ChooseStudentServiceImpl chooseStudentServiceImpl;
	
	@RequestMapping(value="deleteS")
	public void deleteS(HttpSession session,HttpServletResponse response,
			@RequestParam String studId) throws IOException {
		Map <Student,String> map  = (Map) session.getAttribute("map");
		this.chooseStudentServiceImpl.deleteS(studId);
		Teacher t = (Teacher) session.getAttribute("teacher");
		Iterator it = map.keySet().iterator();
		while(it.hasNext()) {
			Student a = (Student)it.next();
			if(a.getStudentId().equals(studId)) {
				it.remove();
			}
		}
		session.setAttribute("map",map);
		response.sendRedirect("/graduateDesign/teacher/chooseStudent.jsp");
	}
}
