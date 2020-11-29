package com.thirdware.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class BusList {
	
	ArrayList<Bus> busList = new ArrayList<Bus>();
	
	public void addBus(Bus bus) {
		busList.add(bus);
	}
	
	public void printBusList() {
		if(!busList.isEmpty()) {
			for (Bus bus : busList) {
				System.out.println(bus.toString());
			}
		}else {
			System.out.println("Bus List Empty");
		}
	}
	
	public boolean removeItem(int id) {
		if(!busList.isEmpty()) {
			for (Iterator<Bus> iterator = busList.iterator(); iterator.hasNext();) {
				Bus bus = (Bus) iterator.next();
				if(bus.getId() == id) {
					busList.remove(bus);
					System.out.println("Bus with "+id+" removed");
					return true;
				}
			}
			System.out.println("Enter valid details");
			return false;
		}
		System.out.println("List is Empty, Enter the bus!");
		return false;
	}
	
	public void sortListByName() {
		Collections.sort(busList, new SortByName());
	}
	
	public void sortListById() {
		Collections.sort(busList, new SortByID());
	}
	
	public void sortListByDuration() {
		Collections.sort(busList, new SortByDuration());
	}
}
