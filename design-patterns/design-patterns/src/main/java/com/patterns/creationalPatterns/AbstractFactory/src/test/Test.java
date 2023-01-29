package com.patterns.creationalPatterns.AbstractFactory.src.test;

import com.patterns.creationalPatterns.AbstractFactory.src.beans.GUIBuilder;
import com.patterns.creationalPatterns.AbstractFactory.src.beans.GUIFactory;
import com.patterns.creationalPatterns.AbstractFactory.src.beans.IButton;
import com.patterns.creationalPatterns.AbstractFactory.src.beans.IWindow;

public class Test {
	public static void main(String[] args) {
		GUIBuilder guiBuilder = new GUIBuilder();
		GUIFactory gui = guiBuilder.createGUIBuilder("MAC");
		IWindow window = gui.createWindow();
		window.setTitle("Test Window");
		System.out.println(window);

		IButton button = gui.createButton();
		button.setLabel("test button");
		System.out.println(button);

		GUIFactory gui2 = guiBuilder.createGUIBuilder("WINDOWS");
		IWindow window2 = gui2.createWindow();
		window2.setTitle("Test Window 2");
		System.out.println(window2);

		IButton button2 = gui2.createButton();
		button2.setLabel("test button 2");
		System.out.println(button2);

	}
}
