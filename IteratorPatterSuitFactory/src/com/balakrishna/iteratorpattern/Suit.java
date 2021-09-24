package com.balakrishna.iteratorpattern;

public class Suit {

	private double cost;
	private SuitTypeEnum TYPE;

	public Suit(double cost, SuitTypeEnum type){
			this.cost=cost;
			this.TYPE=type;
		}

	public double getCost() {
		return cost;
	}

	public SuitTypeEnum getTYPE() {
		return TYPE;
	}

	@Override
	public String toString() {
		return "Suit [cost=" + cost + ", TYPE=" + TYPE + "]";
	}

}
