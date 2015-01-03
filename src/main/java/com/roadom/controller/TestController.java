package com.roadom.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;


@RestController
public class TestController extends MultiActionController {
	
	//public (ModelAndView | Map | String | void) actionName(HttpServletRequest request, HttpServletResponse response, [,HttpSession] [,AnyObject]);
	
	@RequestMapping(value="/{id}")
	public ModelAndView aaa(HttpServletRequest request, HttpServletResponse renponse, Object id){
		System.out.println("%%%%%%%%%%%%%%%aaa%%%%%%%%%%%%%%%");
		return new ModelAndView();
	}
	
	public Map<String, Object> bbb(HttpServletRequest request, HttpServletResponse renponse){
		System.out.println("%%%%%%%%%%%%%%%bbb%%%%%%%%%%%%%%%");
		return new HashMap();
	}
	
	@RequestMapping(value = "/files/{path}", method = RequestMethod.POST)
	public String ccc(HttpServletRequest request, HttpServletResponse renponse){
		System.out.println("%%%%%%%%%%%%%%%ccc%%%%%%%%%%%%%%%");
		return "redirect:files/{path}";
	}
	
	public void ddd(HttpServletRequest request, HttpServletResponse renponse){
		System.out.println("%%%%%%%%%%%%%%%ddd%%%%%%%%%%%%%%%");
	}
	
	public void eee(HttpServletRequest request, HttpServletResponse renponse, HttpSession session){
		System.out.println("%%%%%%%%%%%%%%%eee%%%%%%%%%%%%%%%");
	}
	
	public void fff(){
		System.out.println("%%%%%%%%%%%%%%%fff%%%%%%%%%%%%%%%");
	}
}
