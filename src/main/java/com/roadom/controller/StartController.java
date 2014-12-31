package com.roadom.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * 2. 创建自定义控制器
 * @author roadom
 */
public class StartController implements Controller{		//Controller 最基本的接口

	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("controller is running.");
		
		//返回一个逻辑视图名称，具体逻辑视图start是什么（jsp, velocity, excel）并不关心。
		ModelAndView modelAndView = new ModelAndView("start");
		return modelAndView;
	}

	
}
