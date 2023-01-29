package com.patterns.creationalPatterns.AbstractFactory.src.beans;

// Abstract Factory
public interface GUIFactory {
	public IButton createButton();

	public IWindow createWindow();
}
