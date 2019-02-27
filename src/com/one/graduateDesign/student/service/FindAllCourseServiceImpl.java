package com.one.graduateDesign.student.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.one.graduateDesign.student.dao.FindAllCourseDaoImpl;

@Service
@Transactional(readOnly=false)
public class FindAllCourseServiceImpl {

		@Resource
		private FindAllCourseDaoImpl findAllCourseDaoImpl;
		
		public List findAll() {
			return this.findAllCourseDaoImpl.findAll();
		}
}
