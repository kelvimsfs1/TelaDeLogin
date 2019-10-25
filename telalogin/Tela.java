package TelaDirecoes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Tela implements ActionListener{
	JFrame tela1 = new JFrame();
	JPanel pe = new JPanel();
	JPanel pd = new JPanel();
	JCheckBox caixa1 = new JCheckBox("Norte");
	JCheckBox caixa2 = new JCheckBox("Sul");
	JCheckBox caixa3 = new JCheckBox("Leste");
	JCheckBox caixa4 = new JCheckBox("Oeste");
	JCheckBox caixa5 = new JCheckBox("Centro");
	JButton norte = new JButton("Norte");
	JButton sul = new JButton("sul");
	JButton leste = new JButton("leste");
	JButton oeste = new JButton("oeste");
	JButton centro = new JButton("centro");
	
	public Tela() {
		tela1.setSize(700,500);
		tela1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		tela1.add(pe,BorderLayout.WEST);
		tela1.add(pd,BorderLayout.CENTER);
		pe.setBackground(Color.BLUE);
		pd.setBackground(Color.CYAN);
		
		pe.setPreferredSize(new Dimension(200,200));
		pe.setLayout(new GridLayout(5,1));
		pe.add(caixa1);
		caixa1.addActionListener(this);
		caixa1.setBackground(Color.WHITE);
		pe.add(caixa2);
		caixa2.addActionListener(this);
		caixa2.setBackground(Color.WHITE);
		pe.add(caixa3);
		caixa3.addActionListener(this);
		caixa3.setBackground(Color.WHITE);
		pe.add(caixa4);
		caixa4.addActionListener(this);
		caixa4.setBackground(Color.WHITE);
		pe.add(caixa5);
		caixa5.addActionListener(this);
		caixa5.setBackground(Color.WHITE);
	
		
		pd.setLayout(new BorderLayout());
		norte.setBackground(Color.BLUE);
		pd.add(norte,BorderLayout.NORTH);
		sul.setBackground(Color.CYAN);
		pd.add(sul,BorderLayout.SOUTH);
		leste.setBackground(Color.ORANGE);
		pd.add(leste,BorderLayout.EAST);
		oeste.setBackground(Color.YELLOW);
		pd.add(oeste,BorderLayout.WEST);
		centro.setBackground(Color.WHITE);
		pd.add(centro,BorderLayout.CENTER);
		

		
		
		tela1.setVisible(true);
		

	}

	public static void main(String[] args) {
		new Tela();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == caixa1) {
			norte.setEnabled(!norte.isEnabled());
		}
		
		if(e.getSource() == caixa2) {
			sul.setEnabled(!sul.isEnabled());
		}
		
		if(e.getSource() == caixa3) {
			leste.setEnabled(!leste.isEnabled());
		}
		
		if(e.getSource() == caixa4) {
			oeste.setEnabled(!oeste.isEnabled());
		}
		
		if(e.getSource() == caixa5) {
			centro.setEnabled(!centro.isEnabled());
		}
	}

}
