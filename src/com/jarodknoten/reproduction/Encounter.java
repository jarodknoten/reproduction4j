package com.jarodknoten.reproduction;

import java.util.List;
import java.util.UUID;

public class Encounter {
	
	
	//This is a regular encounter
	public static void stageEncounter(Person a, Person b, Population pop){
		
		//lets check the both meet the encounter minimun age
		if(a.getAge() > 5475 && b.getAge() > 5475){
			
			//The meeting takes place
			meeting(a, b);
			
		}
		
	}
	
	//This is a chance encounter
	public static void chanceEncounter(Person a, Population pop){
		
		List<Person> census = pop.getCensus();
		UUID encUUID = a.getId();
		
		//UUID initially set to person a loop until we find someone different
		while(a.getId().equals(encUUID)) {
			
			Integer i = ReproUtil.randomNumber(0, pop.getCensus().size());
			
			//Do they chat. Checking using bitwise operator for speed (even / odd)
			if ( (i & 1) == 0 ) {
				//System.out.println("Encounter did not happen");
				break;
			}
			
			Person thatPerson = census.get(i);
			encUUID = thatPerson.getId();
			
			if(!a.getId().equals(encUUID)) {
				//System.out.println("Encounter Happened");
				stageEncounter(a, thatPerson, pop);
			}
			
		}
		
	}
	
	public static void meeting(Person a, Person b) {
		
		System.out.println("An ecounter is happening " + a.getSexualPreference() + " " + b.getSex());
		
		if( (a.getSexualPreference().equals( b.getSex() ) || b.getSexualPreference().equals("Any") )  && 
			(b.getSexualPreference().equals( a.getSex() ) || a.getSexualPreference().equals("Any")  )
		  ) {
		
			System.out.println("An ecounter happed giggity");
			
		}
		else {
			System.out.println("asdasdasd");
		}
		
	}

}
