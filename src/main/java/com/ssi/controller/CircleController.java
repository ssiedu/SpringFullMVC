package com.ssi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ssi.model.Circle;
import com.ssi.service.CircleService;


@Controller
public class CircleController {

	@RequestMapping("circledataentry")
	public String showCircleInputPage(){
		return "circleinput.jsp";
	}
	
	@RequestMapping("ProcessCircle")
	public ModelAndView process(@RequestParam("t1") double radius){
		
		CircleService circleService=new CircleService();
		Circle circle=circleService.calculate(radius);
		
		ModelAndView mv=new ModelAndView("result.jsp");
		mv.addObject("author","Manoj");
		mv.addObject("resultdata", circle);//request object
		
		return mv;
		
	}
}
