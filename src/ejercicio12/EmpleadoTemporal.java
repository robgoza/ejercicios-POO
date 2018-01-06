package ejercicio12;

/**
 * Clase que modeliza un empleado temporal de la empresa y que recibe un sueldo
 * fijo por parte de esta
 * 
 * @author robgoza
 *
 */
public class EmpleadoTemporal extends Empleado {
	private String fechaAlta;
	private String fechaBaja;

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
	 * @param alta
	 *            la fecha de alta del empleado
	 * @param baja
	 *            la fecha de baja del empleado
	 */
	public EmpleadoTemporal(String nombre, int edad, String nif, double sueldo, String alta, String baja) {
		super(nombre, edad, nif, sueldo);
		this.fechaAlta = alta;
		this.fechaBaja = baja;

	}

	// Getters y Setters (sin javadoc)
	/**
	 * @return the fechaAlta
	 */
	public String getFechaAlta() {
		return fechaAlta;
	}

	/**
	 * @param fechaAlta
	 *            the fechaAlta to set
	 */
	public void setFechaAlta(String fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	/**
	 * @return the fechaBaja
	 */
	public String getFechaBaja() {
		return fechaBaja;
	}

	/**
	 * @param fechaBaja
	 *            the fechaBaja to set
	 */
	public void setFechaBaja(String fechaBaja) {
		this.fechaBaja = fechaBaja;
	}

}
