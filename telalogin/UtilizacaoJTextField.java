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

public class UtilizacaoJTextField {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Tela de Login");
		frame.setSize(700,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		

		Dimension tamanhoPreferido = new Dimension(280,40);
	
		
		JPanel painel = new JPanel();
		
		JTextField text = new JTextField();
		text.setPreferredSize(tamanhoPreferido);
		
			
		JPasswordField text3 = new JPasswordField();
		text3.setPreferredSize(tamanhoPreferido);
		text3.setText("sou uma senha");
		text3.setToolTipText("Senha");
		text3.setBounds(50, 50, 100, 50);
		
		
		

		painel.add(text);
		painel.add(text3);
		frame.add(painel);
		
		
		frame.show();

	}

}
	
