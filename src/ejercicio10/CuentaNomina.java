package ejercicio10;

/**
 * Clase que modeliza una cuenta nominia que permite obtener reintegros hasta un
 * saldo negativo igual al importe de la nomina
 * 
 * @author robgoza
 *
 */
public class CuentaNomina extends Cuenta {
	private float nomina;
	private float interes;
	private final float comision;

	/**
	 * Constructor de la clase
	 * 
	 * @param titular
	 *            el titular de la cuenta
	 */
	public CuentaNomina(Cliente titular) {
		super(titular);
		comision = 0;
	}

	/**
	 * @see Cuenta#reintegro(float)
	 * @assertion.pre el reintegro ha de ser menor o igual que -nomina
	 */
	@Override
	public void reintegro(float cantidad) {
		assert getReintegro() <= -nomina;
	}

	/**
	 * Funcion que descuenta el interes
	 */
	public void interes() {
		if (getSaldo() > 0) {
			setSaldo(getSaldo() - interes);
		}

	}

	/**
	 * Funcion que cobra la comision a la cuenta
	 */
	public void cobraComision() {
		setSaldo(getSaldo() - comision);
	}

	/**
	 * Metodo que permite obtener la nomina del titular de la cuenta
	 * 
	 * @return la nomina
	 */
	public float getNomina() {
		return nomina;
	}

	/**
	 * Funcion que permite modificar la nomina
	 * 
	 * @param nomina
	 *            la nueva nomina
	 */
	public void setNomina(float nomina) {
		this.nomina = nomina;
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
	 * Funcion que permite modificar el interes de la cuenta
	 * 
	 * @param interes
	 *            el nuevo interes
	 */
	public void setInteres(float interes) {
		this.interes = interes;
	}

	/**
	 * Metodo que permite obtener la comision
	 * 
	 * @return la comision
	 */
	public float getComision() {
		return comision;
	}
}
