package com.patterns.structuralPatterns.Facade.src.kutuphane;

import java.util.HashMap;
import java.util.Map;

import lombok.Data;

@Data
public class Kat {
	private Map<Character, Raf> raflar = new HashMap<>();
}
