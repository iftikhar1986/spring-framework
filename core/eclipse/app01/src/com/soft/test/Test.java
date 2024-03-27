package com.soft.test;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.soft.beans.HelloBean;

public class Test {

	public static void main(String[] args)throws Exception{
		
		ApplicationContext context  = new ClassPathXmlApplicationContext("/com/soft/resources/applicationContext.xml");
		HelloBean hello = (HelloBean)context.getBean("helloBean");
		System.out.println(hello.sayHello());
	}

}
 