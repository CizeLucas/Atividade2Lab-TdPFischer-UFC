package interfaceGrafica;

import java.awt.GridLayout;

public class painelDeDeletar extends Paineis{

	public painelDeDeletar() {
		this.setLayout(new GridLayout(2,2));
		
		this.add(criarJLabel("   Matricula: "));
		this.add(criarJTextField());
		
		this.add(criarJButton("Deletar"));
		
		this.setVisible(false);
	}
}
