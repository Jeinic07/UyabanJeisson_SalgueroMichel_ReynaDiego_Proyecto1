package co.edu.unbosque.view;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class PanelMostrar extends JPanel{

	private JLabel texto;
	private JList<String> lista;
	private DefaultListModel<String> modelo;
	private JScrollPane barra;
	
	
	
	public PanelMostrar() {
		setBounds(133, 236, 752, 309);
		setLayout(null);
		
		
		
		lista = new JList<>();
		lista.setBounds(0, 0, 752, 309);
		modelo = new DefaultListModel<>();

		
		lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		lista.setModel(modelo);
		
		barra = new JScrollPane(lista);
		barra.setBounds(0, 0, 752, 309);
		barra.setOpaque(false);
		
		
		add(barra);
		
		setVisible(false);
		
	}



	public JLabel getTexto() {
		return texto;
	}



	public void setTexto(JLabel texto) {
		this.texto = texto;
	}



	public JList<String> getLista() {
		return lista;
	}



	public void setLista(JList<String> lista) {
		this.lista = lista;
	}



	public DefaultListModel<String> getModelo() {
		return modelo;
	}



	public void setModelo(DefaultListModel<String> modelo) {
		this.modelo = modelo;
	}



	public JScrollPane getBarra() {
		return barra;
	}



	public void setBarra(JScrollPane barra) {
		this.barra = barra;
	}
	
	
	
}
