package ejercicio12;

/**
 * Clase que modeliza un empleado de la empresa
 * 
 * @author robgoza
 *
 */
public class Empleado {

	private String nombre;
	private int edad;
	private String nif;
	private double sueldo;

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
	 */
	public Empleado(String nombre, int edad, String nif, double sueldo) {
		this.nombre = nombre;
		this.edad = edad;
		this.nif = nif;
		this.sueldo = sueldo;
	}

	/**
	 * Metodo que calcula el sueldo del empleado
	 * 
	 * @return el sueldo
	 */
	public double calcularSueldo() {
		return sueldo;
	}

	// Getters y Setters (sin javadoc)
	/**
	 * @param sueldo
	 *            the sueldo to set
	 */
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString();
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 *            the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad
	 *            the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * @return the nif
	 */
	public String getNif() {
		return nif;
	}

	/**
	 * @param nif
	 *            the nif to set
	 */
	public void setNif(String nif) {
		this.nif = nif;
	}
}
