package com.greatlearning.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.greatlearning.service.ExamTip;
import com.greatlearning.service.Teacher;

@Component//("gKTeacher")
public class GKTeacher implements Teacher {
	
	//define a private field for dependency
	ExamTip examtip;
	public GKTeacher() {
		super();
	}
	
	//create constructor for DI
	@Autowired
	public GKTeacher(@Qualifier("revisionTip")ExamTip examtip) {
		super();
		this.examtip = examtip;
	}

	@Override
	public String getHomeWork() {
		return "read current affairs";
	}
	
	//use the injected dependency
	public String getExamTip() {
		return examtip.getExamTip();
	}

}
