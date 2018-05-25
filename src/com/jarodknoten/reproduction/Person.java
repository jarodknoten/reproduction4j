package com.jarodknoten.reproduction;

import java.util.Random;

public class Person {
	
	private String name;
	private Integer birthyear;
	private Integer age;
	private boolean alive;
	private Integer deathAge;
	private String sex;
	private String orientation;
	
	
	Person(){

		Integer tempDeath = predictDeath(0, 36500) ;
		
		this.setName("No Name");
		this.setBirthYear(0);
		this.setAge(0);
		this.setAlive(true);
		this.setDeathAge(tempDeath);
		
		System.out.println("A new person has been created");
		this.toString();
		
	}
	
	public String toString() {
		
		System.out.println("---------------------------------");
		System.out.println("Name: " + this.getName());
		System.out.println("BirthYear: " + this.getBirthYear());
		System.out.println("Age: " + (this.getAge() / 365 ) + " years old");
		System.out.println("Is Alive: " + this.isAlive());
		System.out.println("Will die on Day: " + this.getDeathAge());
		System.out.println("Gender: " + this.getSex());
		System.out.println("---------------------------------");
		System.out.println("");
		
		return null;
		
	}
	
	/*
	 * Getters and Setters
	 * 
	 */
	public static int predictDeath(int min, int max) {

	    Random rand = new Random();
	    int randomNum = rand.nextInt((max - min) + 1) + min;

	    return randomNum;
	}

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

	public String getOrientation() {
		return this.orientation;
	}

	public void setOrientation(String orientation) {
		this.orientation = orientation;
	}

}
