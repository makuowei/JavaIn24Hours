package com.java24hours;

import javax.swing.*;

public class SalutonFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SalutonFrame() {
		//super("Saluton mondo!");
		setTitle("My First Java UI program!");
		setLookAndFeel();
		setSize(450,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	private void setLookAndFeel() {
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception e) {
			// ignore error
		}
	}
	
	public static void main(String[] arguments) {
		SalutonFrame frame = new SalutonFrame();
	}
}

