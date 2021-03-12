package Unidade6;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class JPFApp {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Aplicação");
		frame.setSize(350, 250);
		Container cont = frame.getContentPane();
		JPasswordField tf = new JPasswordField();
		cont.add(tf, BorderLayout.NORTH);
		frame.setVisible(true);
		
	}

}
