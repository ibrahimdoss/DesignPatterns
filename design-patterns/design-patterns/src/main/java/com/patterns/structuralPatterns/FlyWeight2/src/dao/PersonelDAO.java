package com.patterns.structuralPatterns.FlyWeight2.src.dao;

import java.util.HashMap;
import java.util.Map;

import com.patterns.creationalPatterns.Prototype.src.beans.Personel;
import com.patterns.structuralPatterns.FlyWeight2.src.db.Database;

public class PersonelDAO {
	private Map<Integer, Personel> personelCache = new HashMap<>();
	private com.patterns.structuralPatterns.FlyWeight2.src.db.Database database;

	public PersonelDAO(Database database) {
		this.database = database;
	}

	public Personel getPersonel(int id) {
		Personel sonuc = personelCache.get(id);
		if (sonuc == null) {
			System.out.println(id + " id'li personel veritabanindan sorgulaniyor");
			sonuc = database.getPersonel(id);
			personelCache.put(id, sonuc);
		}
		return sonuc;
	}

	public void personelKaydet(Personel personel) {
		System.out.println(personel.getId() + " id'li personel veritabanina kaydediliyor.");
		database.savePersonel(personel);
		personelCache.put(personel.getId(), personel);
	}
}
