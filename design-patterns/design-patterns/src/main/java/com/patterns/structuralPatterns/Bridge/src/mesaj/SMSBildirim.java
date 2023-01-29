package com.patterns.structuralPatterns.Bridge.src.mesaj;

import com.patterns.structuralPatterns.Bridge.src.beans.Musteri;

public class SMSBildirim extends Bildirim {

	public SMSBildirim(Musteri musteri) {
		super(musteri);
	}

	@Override
	public void bildirimYap() {
		System.out.println(getMusteri().getAdi() + " adlı müşteriye sms bildirimi yapildi.");
	}

}
