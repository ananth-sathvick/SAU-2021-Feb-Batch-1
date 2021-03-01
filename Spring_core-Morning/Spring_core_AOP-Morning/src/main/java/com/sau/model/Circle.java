package com.sau.model;

import org.springframework.stereotype.Component;

@Component
public class Circle {

	private String name;

	public String getName() {

		System.out.println("Inside getName of circle");
		return name;
	}

	public void setName(String name) {
		System.out.println("Inside setName of circle");
		this.name = name;
	}

}
