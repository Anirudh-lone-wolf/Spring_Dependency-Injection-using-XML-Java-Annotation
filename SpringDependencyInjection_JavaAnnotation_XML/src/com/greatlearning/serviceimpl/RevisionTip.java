package com.greatlearning.serviceimpl;

import org.springframework.stereotype.Component;

import com.greatlearning.service.ExamTip;

@Component
public class RevisionTip implements ExamTip {

	@Override
	public String getExamTip() {
		
		return "do a lot of revsion";
	}

}
