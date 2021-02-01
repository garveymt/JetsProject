package com.skilldistillery.jets;

public abstract class Jet {

	private String name;
	private double speed;
	private int range;
	private long price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public int getRange() {
		return range;
	}
	public void setRange(int range) {
		this.range = range;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	
//	public Jet() {}
//	public Jet(String name, double speed, int range, long price){
//		this.name = name;
//		this.speed = speed;
//		this.range = range;
//		this.price = price;
//
//	
//
//	}
}
