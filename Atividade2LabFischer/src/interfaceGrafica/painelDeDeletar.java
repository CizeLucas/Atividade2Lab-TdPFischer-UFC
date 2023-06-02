package interfaceGrafica;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.lang.foreign.GroupLayout;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.border.Border;

public class painelDeDeletar extends Paineis{

	public painelDeDeletar() {
		this.setLayout(new GridLayout(2,2));

		
		JPanel jpE = criarJPanel();
		jpE.setLayout(new FlowLayout());
		jpE.add(criarJLabel("   Matricula: "));
		jpE.add(criarJTextField());
		
		this.add(jpE);
		
		JPanel jpD = criarJPanel();
		jpD.add(criarJButton("Deletar"));
		
		this.add(jpD);
		
		
		
		this.setVisible(false);
	}
	
	/*
	 	public painelDeDeletar() {
		this.setLayout(new GridLayout(2,2));
		
		JPanel jpE = criarJPanel();
		jpE.setLayout(new BorderLayout());
		
		JPanel jpD = criarJPanel();
		
		jpE.add(criarJLabel("   Matricula: "), BorderLayout.LINE_START);
		jpE.add(criarJTextField(), BorderLayout.CENTER);
		
		jpD.add(criarJButton("Deletar"));
		
		add(jpE);
		add(jpD);
		this.setVisible(false);
	}
	 */
	
	
	
	
	/*
	 public painelDeDeletar() {
		this.setLayout(new GridLayout(2,2));

		this.add(criarJLabel("   Matricula: "));
		
		this.add(criarJTextField());
		
		this.add(criarJButton("Deletar"));
	
		this.setVisible(false);
	}
	 */
}
