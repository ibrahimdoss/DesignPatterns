package com.patterns.behavioralPatterns.Iterator2.src.test;

import com.patterns.behavioralPatterns.Iterator2.src.liste.Ilerletici;
import com.patterns.behavioralPatterns.Iterator2.src.liste.Liste;

public class Test {
	public static void main(String[] args) {
		Liste<String> liste = new Liste<>();
		liste.ekle("musa");
		liste.ekle("ali");
		liste.ekle("hasan");
		liste.ekle("kerim");
		liste.ekle("asuman");
		liste.ekle("zehra");
		Ilerletici<String> ilerletici = liste.ilerleticiVer();
		while (ilerletici.objeKaldiMi()) {
			String isim = ilerletici.siradakiObje();
			System.out.println(isim);
		}
	}
}
