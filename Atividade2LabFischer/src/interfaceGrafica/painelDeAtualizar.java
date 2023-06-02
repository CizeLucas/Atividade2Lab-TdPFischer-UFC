package interfaceGrafica;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class painelDeAtualizar extends Paineis{

	public painelDeAtualizar() {

		this.setLayout(new GridLayout(3,1));

		JPanel jp1 = criarJPanel(corPadraoJPanel);
		jp1.add(criarJLabel("Matricula:", corPadraoJLabel));
		jp1.add(criarJTextField());
		this.add(jp1);
		
		
		JPanel jp2 = criarJPanel(corPadraoJPanel);
		jp2.add(criarJLabel("Vertente:", corPadraoJLabel));
		jp2.add(criarJTextField());
		this.add(jp2);
		
		
		JPanel jp3 =  criarJPanel(corPadraoJPanel);
		jp3.add(criarJButton("Atualizar", corPadraoJButton));
		this.add(jp3);
		
		this.setBackground(new Color(201, 218, 248));
		this.setVisible(false);
	}
	
	/*
	 public painelDeAtualizar() {
		this.setLayout(new GridLayout(3,3));
		
		this.add(criarJLabel("   Matricula: "));
		this.add(criarJTextField());
		
		this.add(criarJLabel("   Vertente: "));
		this.add(criarJTextField());
		
		this.add(criarJButton("Atualizar"));
		
		this.setVisible(false);
	}
	 */
	
}
