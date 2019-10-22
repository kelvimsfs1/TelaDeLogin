package telalogin;

import java.awt.Color;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class TelaLogin {

		public static void main(String[] args) {
			JFrame jf = new JFrame();
			jf.setTitle("Tela de Login");
			jf.setSize(700,500);
			jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			jf.setLocationRelativeTo(null);
			jf.setVisible(true);
			new TelaLogin();
						
			JPanel painel = new JPanel();
			
			JTextField text = new JTextField();
			text.setBounds(100, 250, 50, 100);;
			
			painel.add(text);
			jf.add(painel);

			jf.show();
		}
	}


