package com.patterns.structuralPatterns.Bridge.src.mesaj;

import com.patterns.structuralPatterns.Bridge.src.beans.Musteri;

public abstract class Bildirim {
	private Musteri musteri;

	public Bildirim(Musteri musteri) {
		this.musteri = musteri;
	}

	protected Musteri getMusteri() {
		return musteri;
	}

	public abstract void bildirimYap();
}
