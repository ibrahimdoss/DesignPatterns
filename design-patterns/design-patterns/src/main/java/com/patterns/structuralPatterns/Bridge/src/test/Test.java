package com.patterns.structuralPatterns.Bridge.src.test;

import java.util.ArrayList;
import java.util.List;

import com.patterns.structuralPatterns.Bridge.src.beans.Musteri;
import com.patterns.structuralPatterns.Bridge.src.beans.Musteri.MusteriBildirimTercihi;
import com.patterns.structuralPatterns.Bridge.src.mesaj.Bildirim;
import com.patterns.structuralPatterns.Bridge.src.mesaj.EPostaBildirim;
import com.patterns.structuralPatterns.Bridge.src.mesaj.SMSBildirim;
import com.patterns.structuralPatterns.Bridge.src.mesaj.WhatsAppBildirim;

public class Test {
	public static void main(String[] args) {
		List<Musteri> musteriler = getMusteriler();
		musteriler.forEach(musteri -> {
			Bildirim bildirim = getBildirim(musteri);
			bildirim.bildirimYap();
		});
	}

	private static List<Musteri> getMusteriler() {
		List<Musteri> musteriler = new ArrayList<>();
		musteriler.add(new Musteri("Şazument", MusteriBildirimTercihi.SMS));
		musteriler.add(new Musteri("Abuzer", MusteriBildirimTercihi.MAIL));
		musteriler.add(new Musteri("Kamile", MusteriBildirimTercihi.WHATSAPP));
		musteriler.add(new Musteri("Mülayim", MusteriBildirimTercihi.SMS));
		musteriler.add(new Musteri("Ruhban", MusteriBildirimTercihi.WHATSAPP));
		return musteriler;
	}

	private static Bildirim getBildirim(Musteri musteri) {
		if (musteri.getBildirimTercihi() == MusteriBildirimTercihi.SMS) {
			return new SMSBildirim(musteri);
		}
		if (musteri.getBildirimTercihi() == MusteriBildirimTercihi.MAIL) {
			return new EPostaBildirim(musteri);
		}
		if (musteri.getBildirimTercihi() == MusteriBildirimTercihi.WHATSAPP) {
			return new WhatsAppBildirim(musteri);
		}
		return null;
	}
}
