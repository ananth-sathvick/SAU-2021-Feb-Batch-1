package com.example.au.couchbasedemo.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.Field;

import com.sun.istack.NotNull;

@Document
public class Football {
    
    @Id
    String id;
    
    @NotNull
    @Field
    String name;
    
    
    @Field
    Integer numberOfGoals;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNumberOfGoals()
	{
		return numberOfGoals;
	}

	public void setNumberOfGoals(Integer numberOfGoals)
	{
		this.numberOfGoals = numberOfGoals;
	}
	
	public String getId() {
		return id;
	}

	public Football(String id, String name, Integer numberOfGoals) {
		super();
		this.id = id;
		this.name = name;
		this.numberOfGoals = numberOfGoals;
	}
    
    
    
}
