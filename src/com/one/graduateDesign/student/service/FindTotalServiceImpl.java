package com.one.graduateDesign.student.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.one.graduateDesign.entity.Project;
import com.one.graduateDesign.student.dao.FindProjectByIdDaoImpl;

@Service
@Transactional(readOnly=false)
public class FindTotalServiceImpl {
	
	@Resource
	private FindProjectByIdDaoImpl findProjectByIdDaoImpl;
	
	public Project find(String id) {
		int a = Integer.parseInt(id);
		return this.findProjectByIdDaoImpl.findProjectById(a);
	}
}
