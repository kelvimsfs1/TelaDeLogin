package telalogin;

import java.awt.BorderLayout;
import java.awt.Color;


import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class TelaLogin extends JFrame{
	
	JPanel painel = new JPanel();
	
	JCheckBox manter = new JCheckBox();
	
	JLabel legenda = new JLabel("Login");
	JLabel Usuario = new JLabel("Usuario");
	JLabel legenda2 = new JLabel("Senha");
	
	
	JButton jb = new JButton("Acessar");
	JButton jb2 = new JButton("Esqueci minha senha");
	
	JCheckBox caixa = new JCheckBox("Manter conectado");
	
	
	
	
	
	JTextField t = new JTextField("Usuario",20);
		
	JPasswordField t3 = new JPasswordField(20);

	
	public TelaLogin() {
		
		
		
		setTitle("Tela de Login");
		setSize(500,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		jb.setBounds(250,250,150,50);
		jb2.setBounds(240,350,170,20);
		t.setAlignmentY(SwingConstants.CENTER);
		t.setAlignmentX(SwingConstants.CENTER);
		t3.setText("senha");
		t3.setToolTipText("Senha");
		legenda.setBounds(50, 20, 100, 50);
		t.setBounds(200, 90, 250, 50);
		t3.setBounds(200, 150, 250, 50);
		Usuario.setBounds(150, 90, 100, 50);
		legenda2.setBounds(150, 150, 100, 50);
		caixa.setBounds(200, 200, 150, 50);
		
	
		
		painel.add(caixa);
		painel.add(t);
		painel.add(t3);
		painel.add(legenda);
		painel.add(legenda2);
		painel.add(jb);
		painel.add(jb2);
		painel.add(manter);
		painel.add(Usuario);
		painel.setLayout(null);
		add(painel);
		
		
		show();
		
	}

	public static void main(String[] args) {
		new TelaLogin();
		
		
	

	}

}
	
