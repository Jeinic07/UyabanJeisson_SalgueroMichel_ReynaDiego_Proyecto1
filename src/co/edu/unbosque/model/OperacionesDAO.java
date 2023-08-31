package co.edu.unbosque.model;

public interface OperacionesDAO {

	public String ingresar(String tipo, String placa, String horaEntrada);
	
	public String eliminar(String placa);
	
	public String mostrarVehiculo(String placa);
	
	public String mostrarTodo();
}
