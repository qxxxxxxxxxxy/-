package com.one.graduateDesign.project.controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.one.graduateDesign.entity.Project;
import com.one.graduateDesign.entity.Teacher;
import com.one.graduateDesign.project.service.DeleteProjectServiceImpl;
import com.one.graduateDesign.project.service.FindByTeacherIdServiceImpl;

@Controller
public class DeleteProjectControllerImpl {
	@Resource
	private DeleteProjectServiceImpl deleteProjectServiceImpl;
	@Resource
	private FindByTeacherIdServiceImpl findByTeacherIdServiceImpl;
	@RequestMapping(value = "deleteProject")
	public void deleteProject(@RequestParam String projectName,@RequestParam String tId,
			HttpServletRequest request,HttpServletResponse response) throws IOException {
	    Project p = this.deleteProjectServiceImpl.DeleteProjectService(projectName);
		Teacher teacher = this.findByTeacherIdServiceImpl.find(tId);
		teacher.getProject().remove(p);
		request.getSession().setAttribute("teacher", teacher);
		request.getSession().setAttribute("projectOfTeacher", teacher.getProject());
		response.sendRedirect("/graduateDesign/teacher/indexOfTeacher.jsp");
	}
}
