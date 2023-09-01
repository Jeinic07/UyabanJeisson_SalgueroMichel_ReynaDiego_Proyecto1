package co.edu.unbosque.view;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelAñadir extends JPanel {

	JLabel texto;
	
	public PanelAñadir() {
		
		setBounds(133, 236, 752, 309);
		setLayout(null);
		
	
		
		texto = new JLabel();
		texto.setText("Añadir");
		texto.setBounds(365, 136, 343, 32);
		
		
		add(texto);
		
		setVisible(false);
	}
	
}
