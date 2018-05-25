package com.jarodknoten.reproduction;

import java.util.Random;
import java.util.UUID;

public class Person {
	
	private String name;
	private Integer birthyear;
	private Integer age;
	private boolean alive;
	private Integer deathAge;
	private String sex;
	private String sexualPreference;
	private UUID id;
	
	
	Person(){

		Integer tempDeath = ReproUtil.randomNumber(0, 36500) ;
		
		this.setName("No Name");
		this.setBirthYear(0);
		this.setAge(0);
		this.setAlive(true);
		this.setDeathAge(tempDeath);
		this.setId(UUID.randomUUID());
		this.setSexualPreference(generateSexPref());
		
		System.out.println("Happy Birthday to...");
		this.toString();
		
	}
	
	public String toString() {
		
		System.out.println("---------------------------------");
		System.out.println("ID: " + this.getId());
		System.out.println("Name: " + this.getName());
		System.out.println("BirthYear: " + this.getBirthYear());
		System.out.println("Age: " + (this.getAge() / 365 ) + " years old");
		System.out.println("Is Alive: " + this.isAlive());
		System.out.println("Will die on Day: " + this.getDeathAge());
		System.out.println("Gender: " + this.getSex());
		System.out.println("Sexual Preference: " + this.getSexualPreference());
		System.out.println("---------------------------------");
		System.out.println("");
		
		return null;
		
	}
	
	public static String generateSexPref() {
		
		String [] sexPrefs = {"Male", "Female", "Any"};
		Random random = new Random();
		
		//Randomly select an index
		int randomIndex = random.nextInt(sexPrefs.length);
		
		return sexPrefs[randomIndex];
		
	}
	
	/*
	 * Getters and Setters
	 * 
	 */

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getBirthYear() {
		return this.birthyear;
	}

	public void setBirthYear(Integer birthyear) {
		this.birthyear = birthyear;
	}

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public boolean isAlive() {
		return this.alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	public Integer getDeathAge() {
		return this.deathAge;
	}

	public void setDeathAge(Integer deathAge) {
		this.deathAge = deathAge;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getSexualPreference() {
		return sexualPreference;
	}

	public void setSexualPreference(String sexualPreference) {
		this.sexualPreference = sexualPreference;
	}

}
