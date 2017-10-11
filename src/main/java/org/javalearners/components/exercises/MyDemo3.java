package org.javalearners.components.exercises;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class MyDemo3 extends JFrame {

	private static final long serialVersionUID = -8412796971067093188L;

	public MyDemo3() {
		super("MyDemo1");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(300, 150));

		final JLabel demoLabel = new JLabel("My Demo", SwingConstants.CENTER);
		demoLabel.setFont(new Font("SansSerif", Font.ITALIC, 18));
		add(demoLabel, BorderLayout.CENTER);

		final JButton demoButton = new JButton("Demo Buttom");
		add(demoButton, BorderLayout.SOUTH);

		getRootPane().setDefaultButton(demoButton);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			final JFrame frame = new MyDemo3();
			frame.pack();
			frame.setVisible(true);
		});
	}

}
