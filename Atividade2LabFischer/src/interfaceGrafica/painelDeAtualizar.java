package interfaceGrafica;

import java.awt.GridLayout;

public class painelDeAtualizar extends Paineis{

	public painelDeAtualizar() {
		this.setLayout(new GridLayout(3,3));
		
		this.add(criarJLabel("   Matricula: "));
		this.add(criarJTextField());
		
		this.add(criarJLabel("   Vertente: "));
		this.add(criarJTextField());
		
		this.add(criarJButton("Atualizar"));
		
		this.setVisible(false);
	}
	
	
	
}
