package com.greatlearning.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.greatlearning.service.ExamTip;
import com.greatlearning.service.Teacher;

@Component
public class MathsTeacher implements Teacher {
	
	ExamTip examtip;
	
	@Autowired
	public MathsTeacher() {
		super();
	}

	public MathsTeacher(@Qualifier("solvePreviousYearsPapers")ExamTip examtip) {
		super();
		this.examtip = examtip;
	}

	@Override
	public String getHomeWork() {
		return "practice any 10 maths questions";
	}
	
	public String getExamTip() {
			return examtip.getExamTip();
	}

}
