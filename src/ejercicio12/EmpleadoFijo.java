package ejercicio12;

public class EmpleadoFijo extends Empleado {
	private int anoAlta;
	private double complemento;

	public EmpleadoFijo(String nombre, int edad, String nif, double sueldo, int anoAlta, double complemento) {
		super(nombre, edad, nif, sueldo);
		this.anoAlta = anoAlta;
		this.complemento = complemento;
	}

	/**
	 * @return the anoAlta
	 */
	public int getAnoAlta() {
		return anoAlta;
	}

	/**
	 * @return the complemento
	 */
	public double getComplemento() {
		return complemento;
	}

	/**
	 * @param complemento
	 *            the complemento to set
	 */
	public void setComplemento(double complemento) {
		this.complemento = complemento;
	}

	@Override
	public double calcularSueldo() {
		return super.calcularSueldo() + complemento;
	}

}
