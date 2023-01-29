package com.patterns.creationalPatterns.AbstractFactory.src.beans;

import lombok.Data;

//product
@Data
public class WindowsButton implements IButton {
	private String label;
}
