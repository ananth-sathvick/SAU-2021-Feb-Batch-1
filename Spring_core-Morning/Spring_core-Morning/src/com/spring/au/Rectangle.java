package com.spring.au;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Rectangle {
	
	private int height; 
	private int width; 
	  
	  @Autowired
	  @Qualifier("pointObj")
	  private ArrayList<Point> points;
	  
	
	

	public int getHeight() {
		return height;
	}




	public ArrayList<Point> getPoints() {
		return points;
	}




	public void setPoints(ArrayList<Point> points) {
		this.points = points;
	}




	public void setHeight(int height) {
		this.height = height;
	}




	public int getWidth() {
		return width;
	}




	public void setWidth(int width) {
		this.width = width;
	}



	public Rectangle(int height,int width) 
	  { 
		  this.height = height;
		  this.width = width;
		  
	  } 
	   
	
	 public void draw() {
		  System.out.println("Rectangle Drawn of height "+ getHeight() +" and width "+ getWidth()  +" with points \n ");
		  char s = 'A';
		  for (int i = 0; i < this.points.size(); i++) {
		      System.out.println("Point " + s + " " + this.points.get(i).getX() + " " + this.points.get(i).getY());
		      s++;
		    }
		  }

	
}
