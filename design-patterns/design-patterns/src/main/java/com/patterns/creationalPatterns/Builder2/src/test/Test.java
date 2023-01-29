package com.patterns.creationalPatterns.Builder2.src.test;

import com.patterns.creationalPatterns.Builder2.src.beans.AhsapEvBuilder;
import com.patterns.creationalPatterns.Builder2.src.beans.BetonEvBuilder;
import com.patterns.creationalPatterns.Builder2.src.beans.Muteahhit;

public class Test {
	public static void main(String[] args) {
		Muteahhit muteahhit = new Muteahhit();
		muteahhit.setBuilder(new AhsapEvBuilder());
		System.out.println(muteahhit.insaEt(true, false));

		muteahhit.setBuilder(new BetonEvBuilder());
		System.out.println(muteahhit.insaEt(true, true));
	}
}
