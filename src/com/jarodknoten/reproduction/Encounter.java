package com.jarodknoten.reproduction;

import java.util.List;
import java.util.UUID;

public class Encounter {
	
	
	//This is a regular encounter
	Encounter(Person a, Person b, Population pop){
			
		
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
				System.out.println("Encounter did not happen");
				break;
			}
			
			Person thatPerson = census.get(i);
			encUUID = thatPerson.getId();
			
			if(!a.getId().equals(encUUID)) {
				System.out.println("Encounter Happened");
			}
			
		}
		
	}

}
