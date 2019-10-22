package telalogin;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Botao extends JFrame {
	
	  JButton jb = new JButton("Acessar");
	  JButton jb2 = new JButton("Esqueci minha senha");
	 
		public Botao() {
			
			setLayout(null);	
			jb.setBounds(250,250,150,50);
			jb2.setBounds(240,350,170,20);
			add(jb2);
			add(jb);
			
			 setTitle("Tela de Login");
			 setSize(700,500);
			 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			 setLocationRelativeTo(null);
			 setVisible(true);
			 
		}
		
		public static void main(String[] args) {
			new Botao();
		}
	}