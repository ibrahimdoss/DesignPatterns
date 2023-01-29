package com.patterns.creationalPatterns.Builder3.src.test;

import com.patterns.creationalPatterns.Builder3.src.beans.Ev;

public class Test {
	public static void main(String[] args) {
		Ev ev = Ev.builder().zemin("Laminant").duvar("beton duvar").cati("kiremit").boya(true)
				.esya(false).build();
		System.out.println(ev);
	}
}
