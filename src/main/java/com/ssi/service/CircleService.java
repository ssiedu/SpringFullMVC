package com.ssi.service;

import com.ssi.model.Circle;



public class CircleService {

	public Circle calculate(double radius){
		
		double area=3.14*radius*radius;
		double circumference=2*3.14*radius;
		
		Circle circle=new Circle();
		circle.setRadius(radius);
		circle.setArea(area);
		circle.setCircumference(circumference);
		
		return circle;
	}
	
	
}
