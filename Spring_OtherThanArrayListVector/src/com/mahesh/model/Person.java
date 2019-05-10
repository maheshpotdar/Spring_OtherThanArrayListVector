package com.mahesh.model;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class Person {

	private Vector cars;
	private TreeSet Bikes;
	private Map IplCricketTeams;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public void setBikes(TreeSet bikes) {
		Bikes = bikes;
	}

	public void setCars(Vector cars) {
		this.cars = cars;
	}

	public void setIplCricketTeams(Map iplCricketTeams) {
		IplCricketTeams = iplCricketTeams;
	}

	@Override
	public String toString() {
		return "Person [cars=" + cars + ", Bikes=" + Bikes + ", IplCricketTeams=" + IplCricketTeams + "]";
	}

	public void displayAllData() {

		System.out.println("Car Info Vector");
		for (Object object : cars) {
			System.out.println(object);
		}

		System.out.println("\n Bikes Info Set");
		for (Object object : Bikes) {
			System.out.println(object);
		}

		System.out.println("\n IplCricketTeams");

		Set set = IplCricketTeams.entrySet();

		Iterator iterator = set.iterator();

		while (iterator.hasNext()) {
			Map.Entry entry = (Map.Entry) iterator.next();
			System.out.println("Key: " + entry.getKey());
			System.out.println("Value: " + entry.getValue());
		}
	}

}
