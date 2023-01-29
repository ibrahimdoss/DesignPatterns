package com.patterns.structuralPatterns.Facade.src.kutuphane;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import lombok.Data;

@Data
public class Kutuphane {
	private Map<Kitap.KitapTurleri, Kat> katlar = new HashMap<>();

	public Kutuphane() {
		Arrays.asList(Kitap.KitapTurleri.values()).forEach(tur -> {
			katlar.put(tur, new Kat());
		});
//		for (int i = 0; i < KitapTurleri.values().length; i++) {
//			katlar.put(KitapTurleri.values()[i], new Kat());
//		}
	}
}
