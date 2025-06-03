package com.assign6;

public enum TrafficLight {
	RED(30),
	GREEN(45),
	YELLOW(5);
	
	private final int duration;
	
	TrafficLight(int duration){
		this.duration=duration;
		
	}
	
	public int getDuration() {
		return this.duration;
	}
	

}
