package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MenuVista extends JFrame {

	private JButton btnIngresarCarro, btnBorrarCarro, btnActualizarCarro;
	private JLabel fondoInicio;
	private Sonido sound;

	public MenuVista() {

		sound = new Sonido();

		setTitle("Parqueadero Titán");
		setBounds(0, 0, 1005, 646);
		setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		fondoInicio = new JLabel();
		fondoInicio.setBounds(0, 0, 1005, 646);
		fondoInicio.setIcon(new ImageIcon("src/Imagenes/FondoEntrada.png"));

		playMusica(0);

		btnIngresarCarro = new JButton("");
		btnIngresarCarro.setBounds(170, 135, 200, 50);
		btnIngresarCarro.setOpaque(false);
		btnIngresarCarro.setBorderPainted(false);
		btnIngresarCarro.setBackground(Color.red);
		btnIngresarCarro.setForeground(Color.WHITE);
		btnIngresarCarro.setIcon(null);

		btnBorrarCarro = new JButton("");
		btnBorrarCarro.setBounds(405, 135, 200, 50);
		btnBorrarCarro.setOpaque(false);
		btnBorrarCarro.setBorderPainted(false);
		btnBorrarCarro.setBackground(Color.red);
		btnBorrarCarro.setForeground(Color.orange);
		btnBorrarCarro.setIcon(null);

		btnActualizarCarro = new JButton("");
		btnActualizarCarro.setBounds(640, 135, 200, 50);
		btnActualizarCarro.setOpaque(false);
		btnActualizarCarro.setBorderPainted(false);
		btnActualizarCarro.setBackground(Color.red);
		btnActualizarCarro.setForeground(Color.WHITE);
		btnActualizarCarro.setIcon(null);

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

	public void setupGame() {
		playMusica(0);
	}

	public void playMusica(int i) {

		sound.setFile(i);
		sound.play();
		sound.loop();
	}

	public void stopMusic() {
		sound.stop();
	}

	public void playSE(int i) {
		sound.setFile(i);
		sound.play();

	}

}
