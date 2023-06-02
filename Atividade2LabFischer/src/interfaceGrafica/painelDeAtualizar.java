package interfaceGrafica;

import java.awt.GridLayout;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class painelDeAtualizar extends Paineis{

	public painelDeAtualizar() {
		this.setLayout(new GridLayout(3,1));
		
		JPanel jp1 = criarJPanel();
		jp1.add(criarJLabel("   Matricula: "));
		jp1.add(criarJTextField());
		
		JPanel jp2 = criarJPanel();
		jp2.add(criarJLabel("   Vertente: "));
		jp2.add(criarJTextField());
		
		JPanel jp3 = criarJPanel();
		jp3.add(criarJButton("Atualizar"));
		
		this.add(jp1);
		this.add(jp2);
		this.add(jp3);
		
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
