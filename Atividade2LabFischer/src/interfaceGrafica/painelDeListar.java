package interfaceGrafica;

import java.awt.BorderLayout;

public class painelDeListar extends Paineis{

	public painelDeListar() {
		this.setLayout(new BorderLayout());
		
		this.add(criarJLabel("LISTA DE ALUNOS VAI AQUI"), BorderLayout.CENTER);
		
		this.setVisible(false);
	}
	
}
