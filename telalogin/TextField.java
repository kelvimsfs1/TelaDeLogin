package telalogin;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TextField  extends JFrame  implements ActionListener {	
	      
	      JTextField box = new JTextField(50);   
		  JButton jb = new JButton("Acessar");
		  JButton jb2 = new JButton("Esqueci minha senha");
		  
		  public void actionPerformed(ActionEvent e) {
			  JOptionPane.showMessageDialog(null, "Acesso Negado");
			  
		  }
		 
			public TextField() {  
				
				setLayout(new FlowLayout());
				add(box);
				
				jb.addActionListener(this); 
				setLayout(null);	 
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
				new TextField();
				
			}
			
		
		}


