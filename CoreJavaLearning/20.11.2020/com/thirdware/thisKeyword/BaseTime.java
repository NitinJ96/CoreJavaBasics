package com.thirdware.thiskeyword;

public class BaseTime {
	private int hour,minute,second;
	public BaseTime() {
		this(0,0,0);
	}
	public BaseTime(int hour) {
		this(hour,0,0);
	}
	public BaseTime(int hour, int minute) {
		this(hour,minute,0);
	}
	public BaseTime(int hour, int minute, int second) {
		this.hour = ((hour>=0&&hour<24)?hour:0);
		this.minute = ((minute>=0&&minute<60)?minute:0);
		this.second = ((second>=0&&second<60)?second:0);
	}
	public int getHour() {
		return this.hour;
	}
	public int getMinute() {
		return this.minute;
	}
	public int getSecond() {
		return this.second;
	}
	
	public String toMilitary() {
		return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
	}
	
}
