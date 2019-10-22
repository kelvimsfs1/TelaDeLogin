package telalogin;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MessageBotao  extends JFrame  implements ActionListener {	
		
		  
		  JButton jb = new JButton("Acessar");
		  JButton jb2 = new JButton("Esqueci minha senha");
		  
		  public void actionPerformed(ActionEvent e) {
			  JOptionPane.showMessageDialog(null, "Acesso Negado");
			  Dimension tamanhoPreferido = new Dimension(280,40);
			  JPanel painel = new JPanel();
			  JTextField text = new JTextField();
			  text.setPreferredSize(tamanhoPreferido);
			  add(text);
			  add(painel);
			  
		  }
		 
		  
			public MessageBotao() {  
				 
				
				jb.addActionListener(this); 
				setLayout(null);	
				jb.setBounds(250,250,150,50);
				jb2.setBounds(240, 350, 170, 20);
				add(jb2);
				add(jb);
				
				
				 setTitle("Tela de Login");
				 setSize(700,500);
				 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				 setLocationRelativeTo(null);
				 setVisible(true);
				 
			}
			
			public static void main(String[] args) {
				new MessageBotao();
				
			}
			
		
		}

