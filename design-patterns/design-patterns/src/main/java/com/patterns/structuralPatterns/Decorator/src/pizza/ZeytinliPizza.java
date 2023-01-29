package com.patterns.structuralPatterns.Decorator.src.pizza;

public class ZeytinliPizza extends Pizza {
	private Pizza pizza;

	public ZeytinliPizza(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getHamur() {
		return pizza.getHamur();
	}

	@Override
	public String getMalzemeler() {
		return pizza.getMalzemeler() + " zeytinli";
	}
}
