package interfaceGrafica;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

@SuppressWarnings("serial")
public class InterfaceGrafica extends JFrame {
	
	JPanel painel1;
	ArrayList<JPanel> JPanels;
	
public InterfaceGrafica() {
	
		ImageIcon image = new ImageIcon("ThumbsupSmiley.png");
		
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
		this.setIconImage(image.getImage());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBackground(Color.BLACK);
		this.setLayout(new BorderLayout());
		
		
		painel1 = criarJPanel(Color.WHITE);
		JButton botao;
		
		botao = criarJButton("Cadastrar", true);
		botao.addActionListener(new botaoCadastrarApertado());
		painel1.add(botao);
		
		botao = criarJButton("Listar", true);
		botao.addActionListener(new botaoListarApertado());
		painel1.add(botao);
		
		botao = criarJButton("Atualizar", true);
		botao.addActionListener(new botaoAtualizarApertado());
		painel1.add(botao);
		
		botao = criarJButton("Deletar", true);
		botao.addActionListener(new botaoDeletarApertado());
		painel1.add(botao);
		
		painel1.setBackground(new Color(201, 218, 248));
		painel1.setBorder(BorderFactory.createLineBorder(Color.WHITE,3));
		
		this.add(painel1, BorderLayout.NORTH);
		
		this.setVisible(true);
	}
	
	public JPanel criarJPanel(Color c) {
		JPanel p = new JPanel();
		p.setBackground(c);
		return p;
	}
	
	public JButton criarJButton(String msg, boolean aplicarCor) {
		JButton b = new JButton(msg);	
		if(aplicarCor) {
			b.setBackground(new Color(217, 234, 211));
		}
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

