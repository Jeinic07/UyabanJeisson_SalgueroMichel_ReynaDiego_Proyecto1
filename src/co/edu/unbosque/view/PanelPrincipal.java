package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelPrincipal extends JPanel {

	private JButton btnIngresarCarro, btnBorrarCarro, btnActualizarCarro;
	private JLabel fondoInicio;
	private Sonido sound;

	public PanelPrincipal() {

		setBounds(0, 0, 1005, 646);
		setLayout(null);

		fondoInicio = new JLabel();
		fondoInicio.setBounds(0, 0, 1005, 646);
		fondoInicio.setIcon(new ImageIcon("src/Imagenes/FondoEntrada.jpg"));

		btnIngresarCarro = new JButton("Agregar vehiculo");
		btnIngresarCarro.setBounds(170, 135, 200, 50);
		btnIngresarCarro.setOpaque(false);
		btnIngresarCarro.setBorderPainted(false);
		btnIngresarCarro.setBackground(Color.red);
		btnIngresarCarro.setForeground(Color.black);
		btnIngresarCarro.setIcon(null);
		btnIngresarCarro.setFocusable(false);

		btnBorrarCarro = new JButton("Eliminar Vehiculos");
		btnBorrarCarro.setBounds(405, 135, 200, 50);
		btnBorrarCarro.setOpaque(false);
		btnBorrarCarro.setBorderPainted(false);
		btnBorrarCarro.setBackground(Color.red);
		btnBorrarCarro.setForeground(Color.black);
		btnBorrarCarro.setIcon(null);
		btnBorrarCarro.setFocusable(false);

		btnActualizarCarro = new JButton("Mostrar vehiculo");
		btnActualizarCarro.setBounds(640, 135, 200, 50);
		btnActualizarCarro.setOpaque(false);
		btnActualizarCarro.setBorderPainted(false);
		btnActualizarCarro.setBackground(Color.red);
		btnActualizarCarro.setForeground(Color.black);
		btnActualizarCarro.setIcon(null);
		btnActualizarCarro.setFocusable(false);

		add(btnActualizarCarro);
		add(btnBorrarCarro);
		add(btnIngresarCarro);
		add(fondoInicio);
		setVisible(true);
	}

	public JLabel getFondoInicio() {
		return fondoInicio;
	}

	public void setFondoInicio(JLabel fondoInicio) {
		this.fondoInicio = fondoInicio;
	}

	public Sonido getSound() {
		return sound;
	}

	public void setSound(Sonido sound) {
		this.sound = sound;
	}

	public JButton getBtnIngresarCarro() {
		return btnIngresarCarro;
	}

	public void setBtnIngresarCarro(JButton btnIngresarCarro) {
		this.btnIngresarCarro = btnIngresarCarro;
	}

	public JButton getBtnBorrarCarro() {
		return btnBorrarCarro;
	}

	public void setBtnBorrarCarro(JButton btnBorrarCarro) {
		this.btnBorrarCarro = btnBorrarCarro;
	}

	public JButton getBtnActualizarCarro() {
		return btnActualizarCarro;
	}

	public void setBtnActualizarCarro(JButton btnActualizarCarro) {
		this.btnActualizarCarro = btnActualizarCarro;
	}

}
