package com.one.graduateDesign.teacher.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.one.graduateDesign.teacher.dao.TeacherPorcessDaoImpl;

@Service
@Transactional(readOnly=false)
public class TeacherProcessServiceImpl {
	@Resource
	private TeacherPorcessDaoImpl teacherPorcessDaoImpl;
	
	public List abc(int tId) {
		return this.teacherPorcessDaoImpl.abc(tId);
	}
	public void acb(int tId) {
		this.teacherPorcessDaoImpl.acd(tId);
	}
}
