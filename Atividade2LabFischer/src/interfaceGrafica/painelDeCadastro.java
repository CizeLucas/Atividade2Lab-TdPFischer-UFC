package interfaceGrafica;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class painelDeCadastro extends Paineis{
	
	public painelDeCadastro() {
		//this.setLayout(new GridLayout(5,2, 10, 10));
		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		
		JPanel painel1 = criarJPanel(corPadraoJPanel);
		painel1.add(criarJLabel("Nome:", corPadraoJLabel));
		painel1.add(criarJTextField());
		this.add(painel1);
		
		JPanel painel2 = criarJPanel(corPadraoJPanel);
		painel2.add(criarJLabel("CPF:", corPadraoJLabel));
		painel2.add(criarJTextField());
		this.add(painel2);
		
		JPanel painel3 = criarJPanel(corPadraoJPanel);
		painel3.add(criarJLabel("Matricula:", corPadraoJLabel));
		painel3.add(criarJTextField());
		this.add(painel3);
		
		JPanel painel4 = criarJPanel(corPadraoJPanel);
		painel4.add(criarJLabel("Vertente:", corPadraoJLabel));
		painel4.add(criarJTextField());
		this.add(painel4);
		
		JPanel painel5 = criarJPanel(corPadraoJPanel);
		painel5.add(criarJButton("Cadastrar", corPadraoJButton));
		this.add(painel5);
		
		this.setVisible(false);
	}

	
	
	
	
	
}
