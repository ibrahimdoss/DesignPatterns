package com.patterns.behavioralPatterns.Observer2.src.test;

import com.patterns.behavioralPatterns.Observer2.src.futbol.Oyuncu;
import com.patterns.behavioralPatterns.Observer2.src.futbol.Top;

public class Test {
	public static void main(String[] args) {
		com.patterns.behavioralPatterns.Observer2.src.futbol.Top top = new com.patterns.behavioralPatterns.Observer2.src.futbol.Top();
		com.patterns.behavioralPatterns.Observer2.src.futbol.Top top2 = new Top();

		com.patterns.behavioralPatterns.Observer2.src.futbol.Oyuncu oyuncu1 = new com.patterns.behavioralPatterns.Observer2.src.futbol.Oyuncu("Gokhan");
		com.patterns.behavioralPatterns.Observer2.src.futbol.Oyuncu oyuncu2 = new com.patterns.behavioralPatterns.Observer2.src.futbol.Oyuncu("Tarik");
		com.patterns.behavioralPatterns.Observer2.src.futbol.Oyuncu oyuncu3 = new com.patterns.behavioralPatterns.Observer2.src.futbol.Oyuncu("Melih");
		com.patterns.behavioralPatterns.Observer2.src.futbol.Oyuncu oyuncu4 = new com.patterns.behavioralPatterns.Observer2.src.futbol.Oyuncu("Emin");
		com.patterns.behavioralPatterns.Observer2.src.futbol.Oyuncu oyuncu5 = new Oyuncu("Riza");

		top.addListener(oyuncu1);
		top.addListener(oyuncu2);
		top.addListener(oyuncu3);

		top2.addListener(oyuncu2);
		top2.addListener(oyuncu5);
		top2.addListener(oyuncu4);

		top.setX(50);
		top.setY(30);

		top2.setX(10);
		top2.setY(60);
	}
}
