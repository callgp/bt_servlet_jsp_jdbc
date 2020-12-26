package com.gp.springcore.reftypes;

public class Scores {

	private double maths;
	private double physics;
	private double chy;
	private double hindi;
	public double getMaths() {
		return maths;
	}
	public void setMaths(double maths) {
		this.maths = maths;
	}
	public double getPhysics() {
		return physics;
	}
	public void setPhysics(double physics) {
		this.physics = physics;
	}
	public double getChy() {
		return chy;
	}
	public void setChy(double chy) {
		this.chy = chy;
	}
	public double getHindi() {
		return hindi;
	}
	public void setHindi(double hindi) {
		this.hindi = hindi;
	}
	@Override
	public String toString() {
		return "Scores [maths=" + maths + ", physics=" + physics + ", chy=" + chy + ", hindi=" + hindi + "]";
	}
	
}
