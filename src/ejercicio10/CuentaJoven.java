package ejercicio10;

/**
 * Clase que modeliza una cuenta joven que no precisa de un saldo minimo para el
 * abono de intereses pero en la que el titular ha de ser menor de 25
 * 
 * @author robgoza
 *
 */
public class CuentaJoven extends CuentaAhorro {
	/**
	 * Constructor de la clase
	 * 
	 * @param titular
	 *            el titular de la cuenta
	 * @param interes
	 *            el interes de la cuenta
	 * @assertion.pre la edad del titular debe de ser menor de 25
	 */
	public CuentaJoven(Cliente titular, float interes) {
		super(titular, interes);
		assert titular.getEdad() < 25;
	}

	/**
	 * @see CuentaAhorro#interes()
	 */
	@Override
	public void interes() {
		setSaldo(getSaldo() + getInteres());
	}

}
