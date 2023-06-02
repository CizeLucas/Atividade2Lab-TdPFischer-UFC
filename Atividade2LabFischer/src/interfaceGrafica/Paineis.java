package interfaceGrafica;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridLayout;

@SuppressWarnings("serial")
public class Paineis extends JPanel{

	public JTextField criarJTextField() {
		JTextField tf = new JTextField();
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
}
