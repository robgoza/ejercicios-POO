package ejercicio12;

/**
 * Clase que modeliza un empleado por horas cuyo sueldo es el producto del
 * numero de horas trabajadas por el precio por hora
 * 
 * @author robgoza
 *
 */
public class EmpleadoPorHoras extends Empleado {
	private final double precioHora;
	private int numeroHoras;

	/**
	 * Constructor de la clase
	 * 
	 * @param nombre
	 *            el nombre del empleado
	 * @param edad
	 *            la edad del empleado
	 * @param nif
	 *            el NIF del empleado
	 * @param sueldo
	 *            el sueldo del empleado
	 * @param precioHora
	 *            el precio de una hora de trabajo del empleado
	 * @param numeroHoras
	 *            el numero de horas que ha trabajado el empleado
	 * @assertion.pre el precio por hora debe de ser mayor a 0
	 * @assertion.pre el numero de Horas trabajadas debe de ser positivo
	 */
	public EmpleadoPorHoras(String nombre, int edad, String nif, double sueldo, double precioHora, int numeroHoras) {
		super(nombre, edad, nif, sueldo);
		assert precioHora > 0;
		assert numeroHoras >= 0;
		this.precioHora = precioHora;
		this.numeroHoras = numeroHoras;
	}

	public int getNumeroHoras() {
		return numeroHoras;
	}

	/**
	 * @see Empleado#calcularSueldo()
	 */
	@Override
	public double calcularSueldo() {
		return precioHora * numeroHoras;
	}
}
