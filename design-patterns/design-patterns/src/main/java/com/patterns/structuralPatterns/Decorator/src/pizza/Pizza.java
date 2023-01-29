package com.patterns.structuralPatterns.Decorator.src.pizza;

public class Pizza {
	public String getHamur() {
		return "";
	}

	public String getMalzemeler() {
		return "";
	}

	@Override
	public String toString() {
		return getHamur() + " hamurlu " + getMalzemeler() + " pizza";
	}
}
