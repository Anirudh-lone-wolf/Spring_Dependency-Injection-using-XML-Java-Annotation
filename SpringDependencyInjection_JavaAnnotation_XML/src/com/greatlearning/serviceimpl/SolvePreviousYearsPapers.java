package com.greatlearning.serviceimpl;

import org.springframework.stereotype.Component;

import com.greatlearning.service.ExamTip;

@Component
public class SolvePreviousYearsPapers implements ExamTip{

	@Override
	public String getExamTip() {
		
		return "solve last 5 years question papers";
	}

}
