package ejercicio12;

public class EmpleadoPorHoras extends Empleado {
	private final double precioHora;
	private int numeroHoras;

	public EmpleadoPorHoras(String nombre, int edad, String nif, double sueldo, double precioHora, int numeroHoras) {
		super(nombre, edad, nif, sueldo);
		this.precioHora = precioHora;
		this.numeroHoras = numeroHoras;
	}

	public int getNumeroHoras() {
		return numeroHoras;
	}

	@Override
	public double calcularSueldo() {
		return precioHora * numeroHoras;
	}
}
