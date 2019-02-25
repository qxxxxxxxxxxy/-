package com.one.graduateDesign.teacher.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.one.graduateDesign.entity.Inform;
import com.one.graduateDesign.teacher.dao.FindInformByTeacherIdImpl;

@Service
@Transactional(readOnly=false)
public class FindInformServiceImpl {
	@Resource
	private FindInformByTeacherIdImpl findInformByTeacherIdImpl;
	
	public Inform findInform(String id) {
		return this.findInformByTeacherIdImpl.findByTeacherId(id);
	}
}
