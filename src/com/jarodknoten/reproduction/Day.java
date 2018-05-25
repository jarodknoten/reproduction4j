package com.jarodknoten.reproduction;

import java.util.List;

public class Day {

	private Integer day;
	
	Day(){
		this.setDay(0);
	}
	
	public void startDay(Population pop) {
		
		List<Person> census = pop.getCensus();
		
		//Age the population
		for(int i = 0; i < pop.getCensus().size(); i++ ) {
			
			Person thisPerson = census.get(i);
			
			//Does this person die today?
			if( thisPerson.getDeathAge().equals(this.getDay()) ) {
				
				thisPerson.setAlive(false);
				
				Banners.showRIP();
				if(pop.getCensus().size() == 1){
					System.out.println(thisPerson.getName() + " has died alone at the age of " + (thisPerson.getAge() / 365 ) + " years old as the last survivor");
					System.out.println("Humanity lasted " + this.getDay() + " days.");
				}
				else{
					System.out.println(thisPerson.getName() + " has died at the age of " + (thisPerson.getAge() / 365 ) + " years old");
				}
				
				
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			//If the person is alive do person stuff
			if( thisPerson.isAlive() ) {
				
				if( pop.getCensus().size() > 1) {
					Encounter.chanceEncounter(thisPerson, pop);
				}
				
				
				//Age the person their day is over
				thisPerson.setAge(thisPerson.getAge() + 1);
			}
			
			
		}
		
	}
	
	public void endDay(Population pop) {
		
		List<Person> census = pop.getCensus();
		
		
		//kill off the dead
		for(int i = 0; i < pop.getCensus().size(); i++ ) {
			Person thisPerson = census.get(i);
			if (thisPerson.isAlive() == false){
				census.remove(i);
			}
		}
		
		setDay(getDay() + 1);
		
		//ReproUtil.clearConsole();
		
	}

	public Integer getDay() {
		return this.day;
	}

	public void setDay(Integer day) {
		this.day = day;
	}
	
}
