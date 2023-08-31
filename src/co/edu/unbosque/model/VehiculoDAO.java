package co.edu.unbosque.model;

import java.io.Serializable;

import co.edu.unbosque.persistance.Serializacion;

public class VehiculoDAO implements OperacionesDAO {

	private MyLinkedList<VehiculoDTO> vehiculos;

	public VehiculoDAO() {
		try {
			vehiculos = (MyLinkedList<VehiculoDTO>) Serializacion.readSerializable("Vehiculo.txt");
		} catch (Exception e) {
			vehiculos = new MyLinkedList<VehiculoDTO>();
		}
	}

	public MyLinkedList<VehiculoDTO> getVehiculos() {
		return vehiculos;
	}

	public void setVehiculos(MyLinkedList<VehiculoDTO> vehiculos) {
		this.vehiculos = vehiculos;
	}

	@Override
	public String ingresar(String tipo, String placa, String horaEntrada) {

		String salida = "";

		try {
			vehiculos.add(new VehiculoDTO(tipo, placa, horaEntrada));
			salida = "\n Vehiculo agregado, Tipo: " + tipo + "\n Placa: " + placa + "\n Hora de ingreso: " + horaEntrada
					+ "\n";
			Serializacion.writeSerializable("Vehiculo.txt", vehiculos);
		} catch (Exception e) {
			e.printStackTrace();
			salida = "\nHizo algo mal chino mk, intente de nuevo";

		}

		return salida;
	}

	@Override
	public String eliminar(String placa) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String mostrarVehiculo(String placa) {
		String salida = "";

		for (int i = 0; i < vehiculos.size(); i++) {
			if (vehiculos.get(i).getInfo().getPlaca().equalsIgnoreCase(placa)) {
				salida = vehiculos.get(i).toString();
			} else {
				salida = "El vehiculo con esa placa no se encuentra en el sistema";
			}
		}

		return salida;

	}

//	@Override
//	public String mostrarTodo() {
//		String salida = "";
//		StringBuilder sb = new StringBuilder();
//
//		for (int i = 0; i < vehiculos.size(); i++) {
//
//			salida += vehiculos.toString();
//
//		}
//		return salida;
//
//	}

	public String mostrarTodo() {

		return vehiculos.toString();

	}
}
