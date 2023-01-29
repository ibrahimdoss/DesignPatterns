package com.patterns.structuralPatterns.Bridge.src.mesaj;

import com.patterns.structuralPatterns.Bridge.src.beans.Musteri;

public class WhatsAppBildirim extends Bildirim {

	public WhatsAppBildirim(Musteri musteri) {
		super(musteri);
	}

	@Override
	public void bildirimYap() {
		System.out.println(getMusteri().getAdi() + " adlı müşteriye whatsapp bildirimi yapildi.");
	}

}