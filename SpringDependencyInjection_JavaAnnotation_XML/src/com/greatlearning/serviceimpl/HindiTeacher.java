package com.greatlearning.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.greatlearning.service.ExamTip;
import com.greatlearning.service.Teacher;

@Component
public class HindiTeacher implements Teacher {
	
	//defining a private field for depenedency 
	ExamTip examtip;
	
	public HindiTeacher() {
		super();
	}
	
	//create constructor for DI
	@Autowired
	public HindiTeacher(@Qualifier("revisionTip")ExamTip examtip) {
		super();
		this.examtip = examtip;
	}

	@Override
	public String getHomeWork() {
		return "do one page of hindi wrirting";
	}
	
	//use the injected dependency
	public String getExamTip() {
		return examtip.getExamTip();
	}

}
