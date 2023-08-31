package co.edu.unbosque.controller;

import java.io.Serializable;
import java.util.Scanner;

import co.edu.unbosque.model.MyLinkedList;
import co.edu.unbosque.model.VehiculoDAO;
import co.edu.unbosque.model.VehiculoDTO;
import co.edu.unbosque.persistance.Serializacion;

public class Controller {

	private VehiculoDAO v;
	private VehiculoDTO vdto;
	private Scanner sc;
	private Serializacion s; 

	public Controller() {
		vdto = new VehiculoDTO(); 
		v = new VehiculoDAO();
		sc = new Scanner(System.in);
	}
	
	public void run() {
		
		ciclo1: while(true) {
			
			System.out.println("hola");
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
			
			
			ciclo2: while(true) {
				
				int op = sc.nextInt();
				switch(op) {
				
				case 1:{
				
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
				case 2:{
					
					break ciclo2;
					
				}		
				
				case 3:{
					sc.nextLine();
					System.out.println("Ingrese la placa del vehiculo que desea ver (AAA 000)");
					String placa = sc.nextLine();

					
					System.out.println(v.mostrarVehiculo(placa));
				
					break ciclo2;
				}
				
				case 4:{
				System.out.println(v.mostrarTodo()); 
					
		
					break ciclo2;
				}
				
				case 5:{
					
					System.exit(0);
				}
				}
				
			}
			
		}
	}
}
