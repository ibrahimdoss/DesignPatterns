package com.patterns.creationalPatterns.AbstractFactory.src.beans;

import lombok.Data;

// product
@Data
public class MacButton implements IButton {
	private String label;
}
