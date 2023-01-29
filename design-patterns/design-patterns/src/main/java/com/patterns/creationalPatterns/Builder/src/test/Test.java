package com.patterns.creationalPatterns.Builder.src.test;

import com.patterns.creationalPatterns.Builder.src.pizza.Pizzaci;
import com.patterns.creationalPatterns.Builder.src.pizza.KasarliMantarliPizzaBuilder;
import com.patterns.creationalPatterns.Builder.src.pizza.PastirmaliPizzaBuilder;
import com.patterns.creationalPatterns.Builder.src.pizza.Pizza;

public class Test {

	public static void main(String[] args) {
		Pizzaci pizzaci = new Pizzaci();
		pizzaci.setPizzaBuilder(new KasarliMantarliPizzaBuilder());
		Pizza pizza = pizzaci.pizzaHazirla();
		System.out.println(pizza);

		pizzaci.setPizzaBuilder(new PastirmaliPizzaBuilder());
		System.out.println(pizzaci.pizzaHazirla());

	}

}
