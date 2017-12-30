package ejercicio12;

public class EmpleadoTemporal extends Empleado {
	private String fechaAlta;
	private String fechaBaja;

	public EmpleadoTemporal(String nombre, int edad, String nif, double sueldo, String alta, String baja) {
		super(nombre, edad, nif, sueldo);
		this.fechaAlta = alta;
		this.fechaBaja = baja;

	}

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
