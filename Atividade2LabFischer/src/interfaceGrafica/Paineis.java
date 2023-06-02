package interfaceGrafica;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Dimension;
import java.awt.GridLayout;

@SuppressWarnings("serial")
public class Paineis extends JPanel{

	public JTextField criarJTextField() {
		JTextField tf = new JTextField();
		tf.setPreferredSize(new Dimension(250, 40));
		return tf;
	}
	
	public JLabel criarJLabel(String msg) {
		JLabel jl = new JLabel(msg);
		return jl;
	}
	
	public JPanel retornarPainel() {
		return this;
	}
	
	public JButton criarJButton(String msg) {
		return new JButton(msg);
	}
	
	public JPanel criarJPanel() {
		return new JPanel();
	}
}
