package com.thirdware.comparator;

import java.util.Comparator;

public class Bus {
	private String name;
	private int id;
	private double duration;
	private String startingTime;
	private String reachingTime;
	private int availableSeats;

	public Bus(String name, int id, double duration, String startingTime, String reachingTime, int availableSeats) {
		super();
		this.name = name;
		this.id = id;
		this.duration = duration;
		this.startingTime = startingTime;
		this.reachingTime = reachingTime;
		this.availableSeats = availableSeats;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public double getDuration() {
		return duration;
	}

	public String getStartingTime() {
		return startingTime;
	}

	public String getReachingTime() {
		return reachingTime;
	}

	public int getAvailableSeats() {
		return availableSeats;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bus other = (Bus) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Bus: \n\tName: " + name + "\n\tId: " + id + "\n\tDuration: " + duration + "\n\tStartingTime: " + startingTime
				+ "\n\tReachingTime: " + reachingTime + "\n\tAvailableSeats: " + availableSeats;
	}
	

}
