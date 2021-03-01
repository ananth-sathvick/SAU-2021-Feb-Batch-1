package com.sau.service;


import com.sau.model.Circle;
import com.sau.model.Rectangle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ShapeService {

	@Autowired
	private Circle circle;

	@Autowired
	private Rectangle rectangle;
	
	public Rectangle getRectangle() {
        System.out.println("Inside getRectangle");
		return rectangle;
	}

	public void setRectangle(Rectangle rectangle) {
        System.out.println("Inside setRectangle");
		this.rectangle = rectangle;
	}

	public Circle getCircle() {
        System.out.println("Inside getCircle");
		return circle;
	}

	public void setCircle(Circle circle) {

        System.out.println("Inside setCircle");
		this.circle = circle;
	}

	
}
