package com.greatlearning.driver;

import com.greatlearning.service.Teacher;
import com.greatlearning.serviceimpl.MathsTeacher;

public class Main {
	public static void main(String[] args) {
		
		Teacher teacher = new MathsTeacher();
		System.out.println(teacher.getHomeWork());

	}
}
