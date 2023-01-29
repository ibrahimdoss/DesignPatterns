package com.patterns.structuralPatterns.Facade.src.test;

import com.patterns.structuralPatterns.Facade.src.kutuphane.Kitap;
import com.patterns.structuralPatterns.Facade.src.kutuphane.Kitap.KitapTurleri;
import com.patterns.structuralPatterns.Facade.src.kutuphane.Kutuphane;
import com.patterns.structuralPatterns.Facade.src.kutuphane.Kutuphaneci;

public class Test {
	public static void main(String[] args) {
		Kutuphaneci kutuphaneci = new Kutuphaneci(new Kutuphane());
		kutuphaneci.kitapVer(new Kitap(KitapTurleri.HIKAYE, "Harem", "Omer Seyfettin"));
		kutuphaneci.kitapVer(new Kitap(KitapTurleri.ROMAN, "Sefiller", "V.Hugo"));
		kutuphaneci.kitapVer(new Kitap(KitapTurleri.HIKAYE, "Yuksek Okceler", "Omer Seyfettin"));
		kutuphaneci.kitapVer(new Kitap(KitapTurleri.HIKAYE, "Bir Ocak Sondu", "Kemalettin Tugcu"));
		kutuphaneci.kitapVer(new Kitap(KitapTurleri.POLISIYE, "Behzat C.", "Anonim"));

		System.out.println(kutuphaneci.kitapAl("Sefiller", KitapTurleri.ROMAN));
		System.out.println(kutuphaneci.kitapAl("Yuksek Okceler", KitapTurleri.POLISIYE));
		System.out.println(kutuphaneci.kitapAl("Sefiller", KitapTurleri.ROMAN));
	}
}
