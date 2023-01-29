package com.patterns.structuralPatterns.FlyWeight.src.test;

import com.patterns.structuralPatterns.FlyWeight.src.tone.ToneGenerator;

public class Test {
	public static void main(String[] args) {
		ToneGenerator generator = new ToneGenerator();
		generator.cevir("5321451481");
	}
}
