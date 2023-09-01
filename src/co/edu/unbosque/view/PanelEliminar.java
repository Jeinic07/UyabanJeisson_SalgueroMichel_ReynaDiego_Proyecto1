package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelEliminar extends JPanel{

	private JLabel textoEliminar;
	private JTextField ingreseNdeEliminar;
	private JButton btnEliminar;
	
	public PanelEliminar() {
		setBounds(133, 236, 752, 309);
		setLayout(null);
		
		textoEliminar = new JLabel();
		textoEliminar.setText("Ingrese la posición que desea eliminar:");
		textoEliminar.setFont(new Font("Times New Roman", Font.BOLD, 24));
		textoEliminar.setBounds(180, 5, 400, 100);
		textoEliminar.setBackground(new Color(0,0,0,180));
		textoEliminar.setForeground(Color.black);
		
		ingreseNdeEliminar = new JTextField("");
		ingreseNdeEliminar.setFont(new Font("Times New Roman", Font.BOLD, 24));
		ingreseNdeEliminar.setBounds(320, 100, 100, 35);
		
		
		btnEliminar = new JButton("Borrar");
		btnEliminar.setBounds(300, 150, 150, 100);
		btnEliminar.setOpaque(false);
		btnEliminar.setBorderPainted(false);
		btnEliminar.setFont(new Font("Times New Roman", Font.TRUETYPE_FONT, 24));
		btnEliminar.setBackground(Color.LIGHT_GRAY);
		btnEliminar.setForeground(Color.DARK_GRAY);
		btnEliminar.setIcon(null);
		
		add(btnEliminar);
		add(ingreseNdeEliminar);
		add(textoEliminar);
		
		
		setVisible(false);
		
	}

	public JLabel getTextoEliminar() {
		return textoEliminar;
	}

	public void setTextoEliminar(JLabel textoEliminar) {
		this.textoEliminar = textoEliminar;
	}

	public JTextField getIngreseNdeEliminar() {
		return ingreseNdeEliminar;
	}

	public void setIngreseNdeEliminar(JTextField ingreseNdeEliminar) {
		this.ingreseNdeEliminar = ingreseNdeEliminar;
	}

	public JButton getBtnEliminar() {
		return btnEliminar;
	}

	public void setBtnEliminar(JButton btnEliminar) {
		this.btnEliminar = btnEliminar;
	}
}
