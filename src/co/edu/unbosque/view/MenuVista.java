package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuVista extends JFrame {

	private JButton btnIngresarCarro, btnBorrarCarro, btnActualizarCarro;
	private JLabel fondoInicio;
	private Sonido sound;
	private PanelPrincipal pp;

	public MenuVista() {
		
		pp = new PanelPrincipal();
		sound = new Sonido();

		setTitle("Parqueadero Titán");
		setBounds(0, 0, 1005, 646);
		setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		playMusica(0);
		
		add(pp);
		setVisible(true);
		
		
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

	public PanelPrincipal getPp() {
		return pp;
	}

	public void setPp(PanelPrincipal pp) {
		this.pp = pp;
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
