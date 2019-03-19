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
import com.one.graduateDesign.teacher.service.StudentProcessServiceImpl;

@Controller
public class TeacherChooseStudentControllerImpl {
	
	@Resource
	private ChooseStudentServiceImpl chooseStudentServiceImpl;
	@Resource
	private ProcessOfStudentServiceImpl processOfStudentImpl;
	@Resource
	private StudentProcessServiceImpl studentProcessServiceImpl;
	
	@RequestMapping(value = "chooseS")
	public void chooseStu(HttpSession session,HttpServletResponse response,
			@RequestParam(value="studId") String studId) throws IOException {	
		Map <Student,String> map  = (Map) session.getAttribute("map");
		this.chooseStudentServiceImpl.chooseStudent(studId);
		Teacher t = (Teacher) session.getAttribute("teacher");
		Iterator it = map.keySet().iterator();
		while(it.hasNext()) {
			Student a = (Student)it.next();
			if(a.getStudentId().equals(studId)) {
				it.remove();
			}
		}
		session.removeAttribute("Maap");
		session.setAttribute("map",map);
		Map <Student,String> mapp = this.studentProcessServiceImpl.findProcess(t);
		session.setAttribute("Maap", map);
		response.sendRedirect("/graduateDesign/teacher/chooseStudent.jsp");
	}
}
