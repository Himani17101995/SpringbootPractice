package com.himani.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.himani.beans.HelloBeans;

public class Test {

	public static void main(String[] args) throws Exception 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("/com/himani/resources/applicationContext.xml");
		
		HelloBeans hb=(HelloBeans)context.getBean("helloBean");
		System.out.println(hb.sayHello());
	}
}
