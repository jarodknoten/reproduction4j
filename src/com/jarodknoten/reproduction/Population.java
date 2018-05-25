package com.jarodknoten.reproduction;

import java.util.ArrayList;
import java.util.List;

public class Population {

	private List<Person> census = new ArrayList<Person>();
	
	Population(){
		Person adam = new Person();
		Person eve = new Person();
		
		adam.setName("Adam");
		eve.setName("Eve");
		
		this.census.add(adam);
		this.census.add(eve);
		
	}
	
	public List<Person> getCensus(){
		return this.census;
	}
	
}
