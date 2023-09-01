package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuVista extends JFrame {

	private JButton btnIngresarVehiculo, btnEliminarVehiculo, btnMostrarVehiculo;
	private JLabel fondoInicio;
	private Sonido sound;
	private PanelAñadir pa;
	private PanelEliminar pe;
	private PanelMostrar pm;

	
	public MenuVista() {
		
		sound = new Sonido();
		pa = new PanelAñadir();
		pe = new PanelEliminar();
		pm = new PanelMostrar();
		
		setTitle("Parqueadero Titán");
		setBounds(0, 0, 1005, 646);
		setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//playMusica(0);
		
		fondoInicio = new JLabel();
		fondoInicio.setBounds(0, 0, 1005, 646);
		fondoInicio.setIcon(new ImageIcon("src/Imagenes/FondoEntrada.jpg"));

		btnIngresarVehiculo = new JButton("Ingresar vehiculo");
		btnIngresarVehiculo.setBounds(170, 135, 200, 50);
		btnIngresarVehiculo.setOpaque(false);
		btnIngresarVehiculo.setBorderPainted(false);
		btnIngresarVehiculo.setBackground(Color.red);
		btnIngresarVehiculo.setForeground(Color.black);
		btnIngresarVehiculo.setIcon(null);
		btnIngresarVehiculo.setFocusable(false);

		btnEliminarVehiculo = new JButton("Eliminar Vehiculos");
		btnEliminarVehiculo.setBounds(405, 135, 200, 50);
		btnEliminarVehiculo.setOpaque(false);
		btnEliminarVehiculo.setBorderPainted(false);
		btnEliminarVehiculo.setBackground(Color.red);
		btnEliminarVehiculo.setForeground(Color.black);
		btnEliminarVehiculo.setIcon(null);
		btnEliminarVehiculo.setFocusable(false);

		btnMostrarVehiculo = new JButton("Mostrar vehiculo");
		btnMostrarVehiculo.setBounds(640, 135, 200, 50);
		btnMostrarVehiculo.setOpaque(false);
		btnMostrarVehiculo.setBorderPainted(false);
		btnMostrarVehiculo.setBackground(Color.red);
		btnMostrarVehiculo.setForeground(Color.black);
		btnMostrarVehiculo.setIcon(null);
		btnMostrarVehiculo.setFocusable(false);
		
		
		
		
		
		
		add(pe);
		add(pm);
		add(pa);
		add(btnMostrarVehiculo);
		add(btnEliminarVehiculo);
		add(btnIngresarVehiculo);
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
	public JButton getBtnIngresarVehiculo() {
		return btnIngresarVehiculo;
	}

	public void setBtnIngresarVehiculo(JButton btnIngresarVehiculo) {
		this.btnIngresarVehiculo = btnIngresarVehiculo;
	}

	public JButton getBtnEliminarVehiculo() {
		return btnEliminarVehiculo;
	}

	public void setBtnEliminarVehiculo(JButton btnEliminarVehiculo) {
		this.btnEliminarVehiculo = btnEliminarVehiculo;
	}

	public JButton getBtnMostrarVehiculo() {
		return btnMostrarVehiculo;
	}

	public void setBtnMostrarVehiculo(JButton btnMostrarVehiculo) {
		this.btnMostrarVehiculo = btnMostrarVehiculo;
	}

	public PanelAñadir getPa() {
		return pa;
	}

	public void setPa(PanelAñadir pa) {
		this.pa = pa;
	}
	
	public PanelEliminar getPe() {
		return pe;
	}



	public void setPe(PanelEliminar pe) {
		this.pe = pe;
	}



	public PanelMostrar getPm() {
		return pm;
	}



	public void setPm(PanelMostrar pm) {
		this.pm = pm;
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
