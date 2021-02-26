package com.spring.au;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean(name="rectangleObj")
	public Rectangle getRectangle() {
		return new Rectangle(5,4);
	}
	
	@Bean(name="pointObj")
	public ArrayList<Point> getPoint() {
		ArrayList<Point> point = new ArrayList<Point>();
		point.add(new Point(10,20));
		point.add(new Point(14,20));
		point.add(new Point(14,25));
		point.add(new Point(10,25));
		return point;
	}

}
