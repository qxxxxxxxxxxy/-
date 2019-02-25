package com.one.graduateDesign.teacher.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.one.graduateDesign.entity.Inform;
import com.one.graduateDesign.entity.Teacher;
import com.one.graduateDesign.teacher.dao.FindTeacherDaoImpl;
import com.one.graduateDesign.teacher.dao.UpdateInformDaoImpl;

@Service
@Transactional(readOnly=false)
public class ModifyInformServiceImpl {
	@Resource
	private FindTeacherDaoImpl findTeacherDaoImpl;
	@Resource
	private UpdateInformDaoImpl updateInformDaoImpl;
	
	public void updateInform(String name,String content,String theme) {
		Teacher teacher = this.findTeacherDaoImpl.findByTeacherName(name);
		Inform inform = teacher.getInform();
		inform.setContent(content);
		inform.setTheme(theme);
		this.updateInformDaoImpl.updateInform(inform);
	}
}
