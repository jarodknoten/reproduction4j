package com.jarodknoten.reproduction;

import java.util.ArrayList;
import java.util.List;

public class Reproduction {
	
	private Integer population = 2;
	private static Integer simDays = 36500;
	private Integer maxPersonAge = 36500;
	
	List<Population> object = new ArrayList<Population>();
	

	public static void main(String[] args) {
		ReproUtil.clearConsole();
		System.out.println("Simulating " + simDays + " Days...");
		
		Day day = new Day();
		Population pop = new Population();
		
		//main simulation loop
		for(int i = 0; i < getSimDays(); i++) {

			day.startDay(pop);
			day.endDay(pop);
			
			if(pop.getCensus().size() == 0) {
				Banners.showEnd();
				break;
			}
			
		}

	}


	public static Integer getSimDays() {
		return simDays;
	}


	public void setSimDays(Integer simDays) {
		Reproduction.simDays = simDays;
	}


}
