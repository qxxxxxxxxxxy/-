package com.one.graduateDesign.student.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.one.graduateDesign.entity.Inform;
import com.one.graduateDesign.entity.Project;
import com.one.graduateDesign.entity.Student;
import com.one.graduateDesign.student.dao.StudentDaoImpl;

@Service
@Transactional(readOnly=false)
public class StudentServiceImpl {

	@Resource
	private StudentDaoImpl studentDaoImpl;
	
	/*学生登录*/
	public Student studentLogin(String studentId, String passWord) {
		Student s = studentDaoImpl.judge(studentId);
		if(s.getPassword().equals(passWord)) {
			return s;
		}
		else {
			return null;
		}
	}
	
	/*学生查看通知*/
	public Inform showNotice(String stuId) {
		Inform notice = studentDaoImpl.findNoticeByStudent(stuId);
		return notice;
	}
	/*查看是否选课成功*/
	public int ifSuccess(String stuId) {
		Student s = studentDaoImpl.findStudent(stuId);
		String ts = s.getTeacherStatus();
		if(ts.equals("1")) {
			return 1;
		}
		return 0;
	}
	
	/*查找学生所选课题*/
    public Project findProjectByStudentId(String stuId) {
    	Project proj = studentDaoImpl.findProjectByStudentId(stuId);
		return proj;
    }
    
    /*找到学生进度*/
    public int findProcess(String stuId) {
    	Student s = studentDaoImpl.findStudent(stuId);
    	String sProc = s.getProcess();
    	if(sProc.equals("0")) {
    		return 0;
    	}
    	if(sProc.equals("1")) {
    		return 1;
    	}
    	if(sProc.equals("2")) {
    		return 2;
    	}
    	if(sProc.equals("3")) {
    		return 3;
    	}
		return 0;
    }
    
    
    /*更新学生进度*/
    public Student stuProcess(String stuId,String proc) {
    	if(proc.equals("1")) {
    		Student s = studentDaoImpl.stuProcess(stuId, "已经开始");
    	}
    	if(proc.equals("2")) {
    		Student s = studentDaoImpl.stuProcess(stuId, "已经完成");
    	}
    	if(proc.equals("3")) {
    		Student s = studentDaoImpl.stuProcess(stuId, "已经提交");
    	}
    	Student s = studentDaoImpl.stuProcess(stuId, proc);
    	return s;
    }
}
