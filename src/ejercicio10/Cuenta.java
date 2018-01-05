package ejercicio10;

/**
 * Clase que modeliza una Cuenta (ya se encuentra definida en el enunciado)
 * 
 * @author robgoza
 *
 */
public class Cuenta {
	private String nombreTitular;
	private float saldo;
	private Cliente titular;
	private float reintegro;

	/**
	 * Constructor de la clase
	 * 
	 * @param titular
	 *            el titular de la cuenta
	 */
	public Cuenta(Cliente titular) {
		this.nombreTitular = titular.getNombre();
		this.saldo = 0;
	}

	/**
	 * Metodo que permite obtener el titular de la cuenta
	 * 
	 * @return el titular de la cuenta
	 */
	public Cliente getTitular() {
		return titular;
	}

	/**
	 * Metodo que permite obtener el saldo de la cuenta
	 * 
	 * @return el saldo de la cuenta
	 */
	public float getSaldo() {
		return saldo;
	}

	/**
	 * Funcion que calcula el reintegro de la cuenta
	 * 
	 * @param cantidad
	 *            la cantidad a restar del saldo
	 * @assertion.pre (cantidad >=0 && getSaldo()-cantidad>=0)
	 */
	public void reintegro(float cantidad) {
		assert cantidad >= 0;
		assert getSaldo() - cantidad >= 0;
		saldo = getSaldo() - cantidad;
	}

	/**
	 * Funcion que modeliza un ingreso en la cuenta
	 * 
	 * @param cantidad
	 *            la cantidad a ingresar
	 */
	public void ingreso(float cantidad) {
		saldo = getSaldo() + cantidad;
	}

	/**
	 * Funcion que permite modificar el saldo
	 * 
	 * @param saldo
	 */
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	/**
	 * Metodo que permite obtener el titular
	 * 
	 * @return the nombreTitular
	 */
	public String getNombreTitular() {
		return nombreTitular;
	}

	/**
	 * Metodo que permite obtener el reintegro
	 * 
	 * @return the reintegro
	 */
	public float getReintegro() {
		return reintegro;
	}
}
