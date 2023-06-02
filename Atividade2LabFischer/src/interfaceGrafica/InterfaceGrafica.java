package interfaceGrafica;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.Border;

@SuppressWarnings("serial")
public class InterfaceGrafica extends JFrame{
	
	JPanel painel1;
	ArrayList<JPanel> JPanels;
	
	public InterfaceGrafica() {
		JPanels = new ArrayList<JPanel>();
		JPanel painelDeCadastro;
		JPanel painelDeListar;
		JPanel painelDeAtualizar;
		JPanel painelDeDeletar;
		
		painelDeCadastro = new painelDeCadastro().retornarPainel();
		JPanels.add(painelDeCadastro);
		
		painelDeListar = new painelDeListar().retornarPainel();
		JPanels.add(painelDeListar);
		
		painelDeAtualizar = new painelDeAtualizar().retornarPainel();
		JPanels.add(painelDeAtualizar);
		
		painelDeDeletar = new painelDeDeletar().retornarPainel();
		JPanels.add(painelDeDeletar);
		
		this.setSize(500, 500);
		this.setTitle("Sistema");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBackground(Color.BLACK);
		this.setLayout(new BorderLayout());
		
		painel1 = criarJPanel(Color.WHITE);
		//painel1.setLayout(new FlowLayout());
		JButton botao;
		
		botao = criarJButton("Cadastrar");
		botao.addActionListener(new botaoCadastrarApertado());
		painel1.add(botao);
		
		botao = criarJButton("Listar");
		botao.addActionListener(new botaoListarApertado());
		painel1.add(botao);
		
		botao = criarJButton("Atualizar");
		botao.addActionListener(new botaoAtualizarApertado());
		painel1.add(botao);
		
		botao = criarJButton("Deletar");
		botao.addActionListener(new botaoDeletarApertado());
		painel1.add(botao);
		
		this.add(painel1, BorderLayout.NORTH);
		
		
		this.setVisible(true);
	}
	
	public JPanel criarJPanel(Color c) {
		JPanel p = new JPanel();
		p.setBackground(c);
		return p;
	}
	
	public JButton criarJButton(String msg) {
		JButton b = new JButton(msg);	
		
		return b;
	}
	
	public void seletorDeJPanel(int seletor) {
		for(int i=0; i<JPanels.size(); i++) {
			if(i==seletor) {
				if (JPanels.get(seletor).isVisible()) {
					JPanels.get(seletor).setVisible(false);
				} else {
					JPanels.get(seletor).setVisible(true);
				}
			} else {
				JPanels.get(i).setVisible(false);
			}
		}
		
		this.add(JPanels.get(seletor));
		this.revalidate();
		this.repaint();
	}
	
	public JTextArea criarJTextArea() {
		JTextArea textarea = new JTextArea();
		
		return textarea;
	}
	
	private class botaoCadastrarApertado implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			seletorDeJPanel(0);	
		}
	}
	
	private class botaoListarApertado implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				seletorDeJPanel(1);
			}
	}
	
	private class botaoAtualizarApertado implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			seletorDeJPanel(2);
		}
	}
	
	private class botaoDeletarApertado implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			seletorDeJPanel(3);
		}
	}
}

