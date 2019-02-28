package com.one.graduateDesign.student.controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.one.graduateDesign.entity.Project;
import com.one.graduateDesign.entity.Student;
import com.one.graduateDesign.student.service.FindTotalServiceImpl;
import com.one.graduateDesign.student.service.StudentChooseProjectServiceImpl;

@Controller
public class StudentChooseProjectControllerImpl {

	@Resource
	private FindTotalServiceImpl findTotalServiceImpl;
	@Resource
	private StudentChooseProjectServiceImpl studentChooseProjectSercviceImpl;
	
	@RequestMapping(value="choose")
	public void studentChooseProject(HttpSession session, @RequestParam String id, HttpServletResponse response)
			throws IOException {
		Project p = this.findTotalServiceImpl.find(id);
		if (p.getTotalNumber() < 3) {
			session.removeAttribute("tot");
			Student student = (Student) session.getAttribute("stu");
			this.studentChooseProjectSercviceImpl.StudentChooseProject(id, student);
			response.sendRedirect("/graduateDesign/student/indexOfStudent.jsp");
		} else {
			session.setAttribute("tot", "名额已满");
			response.sendRedirect("/graduateDesign/student/chooseCourse.jsp");
		}
	}
}
