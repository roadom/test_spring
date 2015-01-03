package com.roadom.biz;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class TestBiz implements ApplicationContextAware{
	
	ApplicationContext applicationContext;

	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		this.applicationContext = applicationContext;
	}
	
	
	
	public void test(){
		applicationContext.getResource("classpath:");
	}
	
	
}
