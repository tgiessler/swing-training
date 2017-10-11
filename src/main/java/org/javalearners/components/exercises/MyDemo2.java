package org.javalearners.components.exercises;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class MyDemo2 extends JFrame {

	private static final long serialVersionUID = -8412796971067093188L;

	public MyDemo2() {
		super("MyDemo2");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(300, 150));

		final JLabel demoLabel = new JLabel("My Demo", SwingConstants.CENTER);
		demoLabel.setFont(demoLabel.getFont().deriveFont(Font.ITALIC | Font.BOLD));
		add(demoLabel, BorderLayout.CENTER);

		final JMenu demoMenu = new JMenu("Demo Menu");
		final JMenuItem demoItem = new JMenuItem("Demo Menu Entry");
		final JMenuBar menubar = new JMenuBar();

		demoMenu.add(demoItem);
		menubar.add(demoMenu);
		setJMenuBar(menubar);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			final JFrame frame = new MyDemo2();
			frame.pack();
			frame.setVisible(true);
		});
	}

}
