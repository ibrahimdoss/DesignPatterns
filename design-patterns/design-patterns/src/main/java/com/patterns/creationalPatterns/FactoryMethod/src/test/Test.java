package com.patterns.creationalPatterns.FactoryMethod.src.test;

import java.util.Arrays;

import com.patterns.creationalPatterns.FactoryMethod.src.yemek.Yemek;
import com.patterns.creationalPatterns.FactoryMethod.src.yemek.Kisir;
import com.patterns.creationalPatterns.FactoryMethod.src.yemek.Menemen;

public class Test {
	public static void main(String[] args) {
		Yemek[] yemekler = { new Kisir(), new Menemen() };
		Arrays.stream(yemekler).forEach(System.out::println);
	}
}
