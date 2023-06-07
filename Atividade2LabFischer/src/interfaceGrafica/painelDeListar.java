package interfaceGrafica;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import controller.*;
@SuppressWarnings("serial")
public class painelDeListar extends Paineis{

	DadosAlunos alunos;
	
	public painelDeListar(DadosAlunos alunos) {
		this.alunos = alunos;
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JPanel jp1 = criarJPanel(corPadraoJPanel, 2);
		jp1.add(criarJLabel("ALUNO VAI AQUI", corPadraoJLabel));
		this.add(jp1);
		JPanel jp2 = criarJPanel(corPadraoJPanel, 2);
		jp2.add(criarJLabel("ALUNO VAI AQUI", corPadraoJLabel));
		this.add(jp2);
		JPanel jp3 = criarJPanel(corPadraoJPanel, 2);
		jp3.add(criarJLabel("ALUNO VAI AQUI", corPadraoJLabel));
		this.add(jp3);
		
		this.setVisible(false);
	}
	
}
