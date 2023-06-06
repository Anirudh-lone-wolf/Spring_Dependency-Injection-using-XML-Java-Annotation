package com.greatlearning.driver;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.greatlearning.service.Teacher;
import com.greatlearning.serviceimpl.GKTeacher;
import com.greatlearning.serviceimpl.HindiTeacher;
import com.greatlearning.serviceimpl.MathsTeacher;

public class SpringDriver {

	public static void main(String[] args) {

		/*
		 * Steps to create and use Spring Container 1. load the spring config file 2.
		 * retreive bean from spring container 3. call methods o the bean 4.close the
		 * context
		 */

		// 1:
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// 2:
		Teacher teacher = context.getBean("mathsTeacher", MathsTeacher.class);

		// 3:
		System.out.println(teacher.getHomeWork());
		System.out.println(teacher.getExamTip());

		// 4:
		context.close();

	}

}
