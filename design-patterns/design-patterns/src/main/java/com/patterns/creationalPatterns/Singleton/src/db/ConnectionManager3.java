package com.patterns.creationalPatterns.Singleton.src.db;

public enum ConnectionManager3 {
	INSTANCE;

	public void getConnection() {
		System.out.println("GetConnection çağırıldı");
	}
}
