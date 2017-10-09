package org.javalearners.components;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.SwingUtilities;

public class TopLevelDemo {
	
	private static void createAndShowGUI() {
		// Create and set up the window.
		final JFrame frame = new JFrame("TopLevelDemo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Create the menu bar. Make it have a green background.
		final JMenuBar greenMenuBar = new JMenuBar();
		greenMenuBar.setOpaque(true);
		greenMenuBar.setBackground(new Color(154, 165, 127));
		greenMenuBar.setPreferredSize(new Dimension(200, 20));
		
		// Create a yellow label to put in the content pane.
		final JLabel yellowLabel = new JLabel();
		yellowLabel.setOpaque(true);
		yellowLabel.setBackground(new Color(248, 213, 131));
		yellowLabel.setPreferredSize(new Dimension(200, 180));
		
		// Set the menu bar and add the label to the content pane.
		frame.setJMenuBar(greenMenuBar);
		frame.getContentPane().add(yellowLabel, BorderLayout.CENTER);
		
		// Display the window.
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			createAndShowGUI();
		});
	}

}
