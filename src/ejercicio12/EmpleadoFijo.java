package ejercicio12;

import java.util.Calendar;

/**
 * Clase que modeliza un empleado fijo de la empresa su sueldo es el resultado
 * de sumarle a la base un complemento anual fijo multiplicado por el numero de
 * años en la empresa
 * 
 * @author robgoza
 *
 */
public class EmpleadoFijo extends Empleado {
	private int anoAlta;
	private double complemento;
	Calendar cal = Calendar.getInstance();
	private int anoActual = cal.get(Calendar.YEAR);

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
	 * @param anoAlta
	 *            el ano en el que el empleado fue dado de alta en la empresa
	 * @param complemento
	 *            el complemento que cobra el empleado
	 */
	public EmpleadoFijo(String nombre, int edad, String nif, double sueldo, int anoAlta, double complemento) {
		super(nombre, edad, nif, sueldo);
		this.anoAlta = anoAlta;
		this.complemento = complemento;
	}
	// Getters y Setters (sin javadoc)

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

	/**
	 * @see Empleado#calcularSueldo()
	 */
	@Override
	public double calcularSueldo() {
		return super.calcularSueldo() + complemento * (anoActual - anoAlta);
	}

}
