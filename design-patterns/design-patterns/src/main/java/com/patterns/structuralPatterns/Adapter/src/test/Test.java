package com.patterns.structuralPatterns.Adapter.src.test;

import com.patterns.structuralPatterns.Adapter.src.personel.PersonelAdapter;
import com.patterns.structuralPatterns.Adapter.src.personel.Personel;

public class Test {
	public static void main(String[] args) {
		Personel personel = new Personel();
		personel.degerAta(Personel.PersonelDegisken.SICIL, 12);
		personel.degerAta(Personel.PersonelDegisken.ADI, "Abdulmuttalip");
		personel.degerAta(Personel.PersonelDegisken.SOYADI, "Uyur");

		System.out.println(personel);

		PersonelAdapter personelAdapter = new PersonelAdapter(new Personel());
		personelAdapter.setSicil(23);
		personelAdapter.setAdi("Makbule");
		personelAdapter.setSoyadi("Kavak");
		System.out.println(personelAdapter.getPersonel());
	}
}
