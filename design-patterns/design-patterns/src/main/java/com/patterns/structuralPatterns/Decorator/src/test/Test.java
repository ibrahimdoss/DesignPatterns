package com.patterns.structuralPatterns.Decorator.src.test;

import com.patterns.structuralPatterns.Decorator.src.pizza.PeynirliPizza;
import com.patterns.structuralPatterns.Decorator.src.pizza.SucukluPizza;
import com.patterns.structuralPatterns.Decorator.src.pizza.ZeytinliPizza;
import com.patterns.structuralPatterns.Decorator.src.pizza.InceHamurPizza;
import com.patterns.structuralPatterns.Decorator.src.pizza.KalinHamurPizza;
import com.patterns.creationalPatterns.Builder.src.pizza.Pizza;

public class Test {
	public static void main(String[] args) {
		Pizza pizza = new PeynirliPizza(new InceHamurPizza(new Pizza()));
		System.out.println(pizza);

		Pizza pizza2 = new KalinHamurPizza(
				new SucukluPizza(new PeynirliPizza(new ZeytinliPizza(new Pizza()))));
		System.out.println(pizza2);

	}
}
