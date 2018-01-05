package ejercicio10;

/**
 * Clase que modeliza una cuenta de credito que permite obtener reintegros hasta
 * un saldo negativo fijo
 * 
 * @author robgoza
 *
 */
public class CuentaCredito extends Cuenta {
	private float descubierto;
	private float comision;

	/**
	 * Constructor de la clase
	 * 
	 * @param titular
	 *            el titular de la cuenta
	 * @param descubierto
	 *            el descubierto que puede tener como maximo la cuenta
	 * @param comision
	 *            la comision que se cobra a la cuenta
	 */
	public CuentaCredito(Cliente titular, float descubierto, float comision) {
		super(titular);
		assert descubierto < 0;
		assert comision >= 0;
		this.descubierto = descubierto;
		this.comision = comision;
	}

	/**
	 * Metodo que permite obtener el descubierto de la cuenta
	 * 
	 * @return el descubierto
	 */
	public float getDescubierto() {
		return descubierto;
	}

	/**
	 * Metodo que permite obtener la comision de la cuenta
	 * 
	 * @return la comision
	 */
	public float getComision() {
		return comision;
	}

	/**
	 * @see Cuenta#reintegro(float)
	 */
	@Override
	public void reintegro(float cantidad) {
		assert getSaldo() - cantidad > descubierto;
		setSaldo(getSaldo() - cantidad);
	}

	/**
	 * Funcion que descuenta del saldo la comision
	 */
	public void cobraComision() {
		setSaldo(getSaldo() - comision);
	}
}
