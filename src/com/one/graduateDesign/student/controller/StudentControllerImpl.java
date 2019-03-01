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
import com.one.graduateDesign.entity.Project;
import com.one.graduateDesign.entity.Student;
import com.one.graduateDesign.student.service.StudentServiceImpl;

@Controller
@RequestMapping(value = "student")
public class StudentControllerImpl {

	@Resource
	private StudentServiceImpl studentServiceImpl; 
	
	/*
	 * 学生登录
	 */
	@RequestMapping(value = "/login",method=RequestMethod.POST)
	public void studentLogin(@RequestParam("studentId") String studentId ,@RequestParam("password") String passWord,
			Model model,HttpSession session,HttpServletRequest request,HttpServletResponse response) throws IOException {
		Student s = studentServiceImpl.studentLogin(studentId, passWord);
		if(s != null) {
			session.setAttribute("stu", s);
			Inform notice = studentServiceImpl.showNotice(studentId);
			if(s.getTeacherStatus().equals("1")) {
				String ntTheme = notice.getTheme();
				String ntCont = notice.getContent();
				session.setAttribute("noticeTheme", ntTheme);
				session.setAttribute("noticeContent", ntCont);
			}
			else {
				session.setAttribute("noticeTheme", "");
				session.setAttribute("noticeContent", "");
			}
			response.sendRedirect("/graduateDesign/student/indexOfStudent.jsp");
		}
		else {
			//model.addAttribute("NameOrPwdError", "用户名或密码错误！");
			response.sendRedirect("/graduateDesign/index.jsp");
		}
	}
	
	/*
	 * 学生退出
	 */
	@RequestMapping(value = "studentExit",method=RequestMethod.GET)
	public void studentExit(HttpServletRequest request,HttpServletResponse response) throws IOException {
		request.removeAttribute("stu");
		request.removeAttribute("tot");
		response.sendRedirect("/graduateDesign/index.jsp");
	}
	/*查看是否选课成功*/
	@RequestMapping(value = "ifSuccess")
	public void ifSuccess(@RequestParam("studentId") String stuId,HttpServletRequest request,
			HttpServletResponse response,HttpSession session) throws IOException {
		int ts = studentServiceImpl.ifSuccess(stuId);
		if(ts == 1) {
			Project proj = studentServiceImpl.findProjectByStudentId(stuId);
			String pName = proj.getName();
			String tName = proj.getTeacher().getName();
			session.setAttribute("pName", pName);
			session.setAttribute("tName", tName);
			session.setAttribute("ts", "选题成功");
			int sProc = studentServiceImpl.findProcess(stuId);
			if(sProc == 0) {
				session.setAttribute("sProc", "未开始");
			}
			if(sProc == 1) {
				session.setAttribute("sProc", "已开始");
			}
			if(sProc == 2) {
				session.setAttribute("sProc", "已完成");
			}
			if(sProc == 3) {
				session.setAttribute("sProc", "已提交");
			}
			response.sendRedirect("/graduateDesign/student/process.jsp");
		}
		else {
			session.setAttribute("pName", "");
			session.setAttribute("tName", "");
			session.setAttribute("ts", "尚未选题");
			session.setAttribute("sProc", "");
			response.sendRedirect("/graduateDesign/student/process.jsp");
		}
	}
	
	/*进度管理*/
	@RequestMapping(value = "stuProcess",method=RequestMethod.POST)
	public void stuProcess(@RequestParam("proc") String proc,@RequestParam("stuId") String stuId,HttpServletRequest request,
			HttpServletResponse response,HttpSession session) throws IOException {
		int ts = studentServiceImpl.ifSuccess(stuId);
		if(ts == 1) {
			Student s = studentServiceImpl.stuProcess(stuId, proc);
			String stuProc = s.getProcess();
			if(stuProc.equals("1")) {
				session.setAttribute("sProc", "已开始");
			}
			if(stuProc.equals("2")) {
				session.setAttribute("sProc", "已完成");
			}
			if(stuProc.equals("3")) {
				session.setAttribute("sProc", "已提交");
			}
			response.sendRedirect("/graduateDesign/student/process.jsp");
		}
		else {
			response.sendRedirect("/graduateDesign/student/process.jsp");
		}
	}
}
