package interfaceGrafica;

import java.awt.GridLayout;

public class painelDeCadastro extends Paineis{
	
	public painelDeCadastro() {
		setLayout(new GridLayout(5,2, 10, 10));
		
		this.add(criarJLabel("   Nome:"));
		this.add(criarJTextField());
		
		this.add(criarJLabel("   CPF:"));
		this.add(criarJTextField());
		
		this.add(criarJLabel("   Matricula:"));
		this.add(criarJTextField());
		
		this.add(criarJLabel("   Vertente:"));
		this.add(criarJTextField());
		
		this.add(criarJButton("Cadastrar"));
		
		this.setVisible(false);
	}

	
	
	
	
	
}
