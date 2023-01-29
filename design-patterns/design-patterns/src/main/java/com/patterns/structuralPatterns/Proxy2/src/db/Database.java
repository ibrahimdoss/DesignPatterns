package com.patterns.structuralPatterns.Proxy2.src.db;

import java.math.BigDecimal;

import com.patterns.structuralPatterns.Proxy2.src.bean.IPersonel;
import com.patterns.structuralPatterns.Proxy2.src.bean.Personel;
import com.patterns.structuralPatterns.Proxy2.src.bean.PersonelProxy;

public class Database {
	private static String[] isimler = { "Ali", "Ahmet", "Zeynep", "Aleyna", "Mahmut", "Kerim" };

	public IPersonel getPersonel(int id) {
		return new PersonelProxy(new Personel(id, getIsim(), getMaas()));
	}

	private BigDecimal getMaas() {
		// 5500 - 25000
		int maas = (int) (Math.random() * (250 - 55) + 55);
		maas *= 100;
		return new BigDecimal(maas);
	}

	private String getIsim() {
		return isimler[(int) (Math.random() * isimler.length)];
	}

//	public static void main(String[] args) {
//		Database db = new Database();
//		for (int i = 0; i < 100; i++) {
//			System.out.println(db.getMaas());
//		}
//	}
}
