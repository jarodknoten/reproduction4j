package com.jarodknoten.reproduction;

import java.util.List;

public class Day {

	private Integer day;
	
	Day(){
		this.setDay(0);
	}
	
	public void endDay(Population pop) {
		
		List<Person> census = pop.getCensus();
		
		
		//Age the population
		for(int i = 0; i < pop.getCensus().size(); i++ ) {
			
			Person thisPerson = census.get(i);
			System.out.println(thisPerson.getDeathAge() + " " + this.getDay());
			
			//Does this person die today?
			if( thisPerson.getDeathAge().equals(this.getDay()) ) {
				System.out.println("killing");
				thisPerson.setAlive(false);
				
				Banners.showRIP();
				System.out.println(thisPerson.getName() + " has died at the age of " + thisPerson.getAge());
				
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			//If the person is alive do person stuff
			if( thisPerson.isAlive() ) {
				thisPerson.setAge(thisPerson.getAge() + 1);
				thisPerson.toString();
			}
			
			
		}
		
		//kill off the dead
		for(int i = 0; i < pop.getCensus().size(); i++ ) {
			Person thisPerson = census.get(i);
			if (thisPerson.isAlive() == false){
				census.remove(i);
			}
		}
		
		System.out.println("End of Day " + getDay());
		System.out.println("Current Population " + pop.getCensus().size() );
		setDay(getDay() + 1);
		
	}

	public Integer getDay() {
		return this.day;
	}

	public void setDay(Integer day) {
		this.day = day;
	}
	
}
