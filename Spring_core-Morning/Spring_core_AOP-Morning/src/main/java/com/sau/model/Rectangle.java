package com.sau.model;

import org.springframework.stereotype.Component;

@Component
public class Rectangle {

	private String name;

	public String getName() {

		System.out.println("Inside getName of rectangle");
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("Inside setName of rectangle");
		throw (new ArithmeticException());
	}
}
