package com.patterns.creationalPatterns.Builder2.src.beans;

import lombok.Data;

@Data
public abstract class EvBuilder {
	private Ev ev;

	public abstract void zeminHazirla();

	public abstract void duvarHazirla();

	public abstract void catiHazirla();
}
