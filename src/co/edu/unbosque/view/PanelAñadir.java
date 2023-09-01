package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelAñadir extends JPanel {

	private JLabel texto, textoPlaca, textoHora, textoTipo;
	private JTextField ingreseNdePlaca, ingreseTipo, ingreseHora;
	private JButton btnAgregrar;
	
	public PanelAñadir() {
		
		setBounds(133, 236, 752, 309);
		setLayout(null);
		
		
		textoTipo = new JLabel();
		textoTipo.setText("Ingrese tipo de vehiculo:");
		textoTipo.setFont(new Font("Times New Roman", Font.BOLD, 24));
		textoTipo.setBounds(50, 5, 350, 100);
		textoTipo.setBackground(new Color(0,0,0,180));
		textoTipo.setForeground(Color.black);
		
		ingreseTipo = new JTextField("");
		ingreseTipo.setFont(new Font("Times New Roman", Font.BOLD, 24));
		ingreseTipo.setBounds(400, 35, 100, 35);
		
		textoPlaca = new JLabel();
		textoPlaca.setText("Ingrese placa:");
		textoPlaca.setFont(new Font("Times New Roman", Font.BOLD, 24));
		textoPlaca.setBounds(50, 79, 350, 100);
		textoPlaca.setBackground(new Color(0,0,0,180));
		textoPlaca.setForeground(Color.black);
		
		ingreseNdePlaca = new JTextField("");
		ingreseNdePlaca.setFont(new Font("Times New Roman", Font.BOLD, 24));
		ingreseNdePlaca.setBounds(400, 110, 100, 35);
		
		textoHora = new JLabel();
		textoHora.setText("Ingrese hora de entrada:");
		textoHora.setFont(new Font("Times New Roman", Font.BOLD, 24));
		textoHora.setBounds(50, 150, 350, 100);
		textoHora.setBackground(new Color(0,0,0,180));
		textoHora.setForeground(Color.black);
		
		ingreseHora = new JTextField("");
		ingreseHora.setFont(new Font("Times New Roman", Font.BOLD, 24));
		ingreseHora.setBounds(400, 180, 100, 35);
		
		btnAgregrar = new JButton("Agregar");
		btnAgregrar.setBounds(550, 100, 150, 100);
		btnAgregrar.setOpaque(false);
		btnAgregrar.setBorderPainted(false);
		btnAgregrar.setFont(new Font("Times New Roman", Font.TRUETYPE_FONT, 24));
		btnAgregrar.setBackground(Color.LIGHT_GRAY);
		btnAgregrar.setForeground(Color.DARK_GRAY);
		btnAgregrar.setIcon(null);
		
		
		texto = new JLabel();
		texto.setText("Añadir");
		texto.setBounds(365, 136, 343, 32);
		
		add(btnAgregrar);
		add(ingreseHora);
		add(textoHora);
		add(textoTipo);
		add(ingreseTipo);
		add(textoPlaca);
		add(ingreseNdePlaca);
		add(texto);
		
		setVisible(false);
	}

	public JLabel getTexto() {
		return texto;
	}

	public void setTexto(JLabel texto) {
		this.texto = texto;
	}

	public JLabel getTextoPlaca() {
		return textoPlaca;
	}

	public void setTextoPlaca(JLabel textoPlaca) {
		this.textoPlaca = textoPlaca;
	}

	public JLabel getTextoHora() {
		return textoHora;
	}

	public void setTextoHora(JLabel textoHora) {
		this.textoHora = textoHora;
	}

	public JLabel getTextoTipo() {
		return textoTipo;
	}

	public void setTextoTipo(JLabel textoTipo) {
		this.textoTipo = textoTipo;
	}

	public JTextField getIngreseNdePlaca() {
		return ingreseNdePlaca;
	}

	public void setIngreseNdePlaca(JTextField ingreseNdePlaca) {
		this.ingreseNdePlaca = ingreseNdePlaca;
	}

	public JTextField getIngreseTipo() {
		return ingreseTipo;
	}

	public void setIngreseTipo(JTextField ingreseTipo) {
		this.ingreseTipo = ingreseTipo;
	}

	public JTextField getIngreseHora() {
		return ingreseHora;
	}

	public void setIngreseHora(JTextField ingreseHora) {
		this.ingreseHora = ingreseHora;
	}

	public JButton getBtnAgregrar() {
		return btnAgregrar;
	}

	public void setBtnAgregrar(JButton btnAgregrar) {
		this.btnAgregrar = btnAgregrar;
	}
	
	
}
