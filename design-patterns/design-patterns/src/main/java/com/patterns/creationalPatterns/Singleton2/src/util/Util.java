package com.patterns.creationalPatterns.Singleton2.src.util;

public class Util {
	private static Util instance = new Util();

	private Util() {
		if (instance != null) {
			throw new RuntimeException("Util sınıfının ikinci instance'ı yaratılamaz.");
		}
	}
}
