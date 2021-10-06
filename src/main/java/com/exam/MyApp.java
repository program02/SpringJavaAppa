package com.exam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/exam/beans.xml");
		Student s1 = (Student) ctx.getBean("st");

		System.out.println(s1.getComputer().brand);

		for (String name : s1.getStList()) {
			System.out.println(name);
		}
		for (String name : s1.getStSet()) {
			System.out.println(name);

		}
		for (String name : s1.getStMap().values()) {
			System.out.println(name);

		}

	}
}