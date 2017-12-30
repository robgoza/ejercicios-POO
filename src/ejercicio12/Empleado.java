package ejercicio12;

public class Empleado {
	private String nombre;
	private int edad;
	private String nif;
	private double sueldo;

	public Empleado(String nombre, int edad, String nif, double sueldo) {
		this.nombre = nombre;
		this.edad = edad;
		this.nif = nif;
		this.sueldo = sueldo;
	}

	public double calcularSueldo() {
		return sueldo;
	}

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
		// TODO Auto-generated method stub
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
