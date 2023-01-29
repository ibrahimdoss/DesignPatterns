package com.patterns.structuralPatterns.FlyWeight2.src.db;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.patterns.creationalPatterns.Prototype.src.beans.Personel;

// Veritabani gibi davranan simulator sinifi
public class Database {
	private Map<Integer, Personel> personeller = new HashMap<>();

	public Database() {
	}

	public Database(Personel... personels) {
		Arrays.stream(personels).forEach(p -> personeller.put(p.getId(), p));
	}

	public Personel getPersonel(int id) {
		return personeller.get(id);
	}

	public void savePersonel(Personel personel) {
		personeller.put(personel.getId(), personel);
	}

	public void veritabaniIcerigiYaz() {
		System.out.println("Veritabani icerigi:");
		personeller.entrySet().forEach(System.out::println);
	}
}
