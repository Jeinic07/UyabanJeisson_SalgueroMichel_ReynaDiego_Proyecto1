package co.edu.unbosque.controller;

import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.util.Scanner;

import co.edu.unbosque.model.VehiculoDAO;
import co.edu.unbosque.model.VehiculoDTO;
import co.edu.unbosque.persistance.Serializacion;
import co.edu.unbosque.util.MyLinkedList;
import co.edu.unbosque.view.MenuVista;
import co.edu.unbosque.view.PanelAñadir;
import co.edu.unbosque.view.PanelEliminar;
import co.edu.unbosque.view.PanelPrincipal;

public class Controller implements ActionListener {

	private VehiculoDAO v;
	private Scanner sc;
	private Serializacion s;
	private MenuVista mv;
	private PanelAñadir pa;
	private PanelEliminar pe;

	public Controller() {

		v = new VehiculoDAO();
		mv = new MenuVista();
		sc = new Scanner(System.in);
		pa = new PanelAñadir();
		agregarLectores();
	}

	private void agregarLectores() {

		mv.getBtnMostrarVehiculo().addActionListener(this);
		mv.getBtnMostrarVehiculo().setActionCommand("Mostrar");

		mv.getBtnEliminarVehiculo().addActionListener(this);
		mv.getBtnEliminarVehiculo().setActionCommand("Eliminar");

		mv.getBtnIngresarVehiculo().addActionListener(this);
		mv.getBtnIngresarVehiculo().setActionCommand("Ingresar");

		mv.getPa().getBtnAgregar().addActionListener(this);
		mv.getPa().getBtnAgregar().setActionCommand("Agregar");
		
		mv.getPe().getBtnEliminar().addActionListener(this);
		mv.getPe().getBtnEliminar().setActionCommand("Borrar");
		

		;

	}

	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case "Ingresar": {

			mv.getPa().setVisible(true);
			mv.getPm().setVisible(false);
			mv.getPe().setVisible(false);
			break;
		}

		case "Agregar": {

			String tipo = mv.getPa().getIngreseTipo().getText();
			String placa = mv.getPa().getIngreseNdePlaca().getText();
			String hEntrada = mv.getPa().getIngreseHora().getText();

			System.out.println(v.ingresar(tipo, placa, hEntrada));

			break;
		}

		case "Mostrar": {
			mv.getPm().vaciarModelo();
			
			for (int i = 0; i < v.getVehiculos().size(); i++) {
				String[] pos = v.mostrarTodo();
				
				mv.getPm().llenarModelo(pos[i]);
			
			}

			mv.getPa().setVisible(false);
			mv.getPm().setVisible(true);
			mv.getPe().setVisible(false);

			break;
		}
		case "Eliminar": {
			mv.getPa().setVisible(false);
			mv.getPm().setVisible(false);
			mv.getPe().setVisible(true);

			break;
		}
		case "Borrar": {
			
		

			int pos = Integer.parseInt(mv.getPe().getIngreseNdeEliminar().getText());
			v.eliminar(pos);
//
//			System.out.println(pos);
			break;
		}

		default:
			break;
		}
		String command = e.getActionCommand();
		System.out.println(command);
	}

	public void run() {

		ciclo1: while (true) {

			System.out.println("__________________________________________");
			System.out.println("");
			System.out.println("SISTEMA DE ALMACENAMIENTO DE VEHICULOS ");
			System.out.println("");
			System.out.println("Que desea realizar?");
			System.out.println("");
			System.out.println("1. Ingresar un vehiculo.");
			System.out.println("2. Eliminar un vehiculo.");
			System.out.println("3. Mostrar un vehiculo.");
			System.out.println("4. Mostrar todos los vehiculos.");
			System.out.println("5. Salir.");
			System.out.println("");
			System.out.println("__________________________________________");

			ciclo2: while (true) {

				int op = sc.nextInt();
				switch (op) {

				case 1: {

					System.out.println("Ingrese el tipo de vehiculo (camioneta, automovil, moto)");
					sc.nextLine();
					String tipo = sc.nextLine();

					System.out.println("Ingrese la placa del vehiculo (AAA 000)");
					String placa = sc.nextLine();

					System.out.println("Ingrese la hora de ingreso (formato 24 horas -> 15 00)");
					String horaEntrada = sc.nextLine();

					System.out.println(v.ingresar(tipo, placa, horaEntrada));
					break ciclo2;
				}
				case 2: {

					System.out.println("Ingrese la poscicion del vehiculo que desa borrar");
					int pos = sc.nextInt();

					System.out.println(v.eliminar(pos));

					break ciclo2;

				}

				case 3: {
					sc.nextLine();
					System.out.println("Ingrese la placa del vehiculo que desea ver (AAA 000)");
					String placa = sc.nextLine();

					System.out.println(v.mostrarVehiculo(placa));

					break ciclo2;
				}

				case 4: {
					System.out.println(v.mostrarTodo());

					break ciclo2;
				}

				case 5: {

					System.exit(0);
				}
				}

			}

		}
	}
}
