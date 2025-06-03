package com.app.geometry;

public class Point2D {
	private double x;
	private double y;

	public Point2D(double x,double y) {
		this.x=x;
		this.y=y;
		
	}
	public String getDetails() {
		return "(" + x + "," + y + ")";
	}
	
	public boolean isEqual(Point2D other) {
		return this.x==other.x && this.y==other.y;
	}
	
	public double calculateDistance(Point2D other) {
		return Math.sqrt(Math.pow(this.x-other.x,2)+Math.pow(this.y-other.y, 2));
	}

	
}
