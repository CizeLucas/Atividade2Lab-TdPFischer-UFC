package interfaceGrafica;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class painelDeListar extends Paineis{

	public painelDeListar() {
		Border bf = BorderFactory.createLineBorder(Color.BLACK,2);
		
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JPanel jp1 = criarJPanel(corPadraoJPanel, 2);
		jp1.add(criarJLabel("LISTA DE ALUNOS VAI AQUI", corPadraoJLabel));
		this.add(jp1);
		JPanel jp2 = criarJPanel(corPadraoJPanel, 2);
		jp2.add(criarJLabel("LISTA DE ALUNOS VAI AQUI", corPadraoJLabel));
		this.add(jp2);
		JPanel jp3 = criarJPanel(corPadraoJPanel, 2);
		jp3.add(criarJLabel("LISTA DE ALUNOS VAI AQUI", corPadraoJLabel));
		this.add(jp3);
//		jp1.add(criarJLabel("LISTA DE ALUNOS VAI AQUI"));
//		this.add(jp1);
//		jp1.add(criarJLabel("LISTA DE ALUNOS VAI AQUI"));
//		this.add(jp1);
		
		this.setVisible(false);
	}
	
}
