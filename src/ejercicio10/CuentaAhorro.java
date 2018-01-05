package ejercicio10;

/**
 * Clase que modeliza una cuenta de Ahorro que no admite saldo negativo y en la
 * que si el saldo es igual o superior a 1000 euros se ingresa el interes
 * pactado
 * 
 * @author robgoza
 *
 */
public class CuentaAhorro extends Cuenta {
	private float interes;

	/**
	 * Constructor de la clase
	 * 
	 * @param titular
	 *            el titular de la cuenta
	 * @param interes
	 *            el interes que se va a ingresar
	 * @assertion.pre el saldo debe ser positivo
	 */
	public CuentaAhorro(Cliente titular, float interes) {
		super(titular);
		assert getSaldo() >= 0;
		this.interes = interes;
	}

	/**
	 * Metodo que permite obtener el interes de la cuenta
	 * 
	 * @return el interes
	 */
	public float getInteres() {
		return interes;
	}

	/**
	 * Funcion que ingresa el interes siempre y cuando el saldo sea mayor de
	 * 1000 euros
	 */
	public void interes() {
		if (getSaldo() > 1000) {
			setSaldo(getSaldo() + interes);
		}
	}

}
